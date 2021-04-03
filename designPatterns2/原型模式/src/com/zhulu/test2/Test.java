package com.zhulu.test2;

import java.util.Date;

import com.zhulu.test.Sheep;

/*
 * 测试深复制
 */
public class Test {

	public static void main(String[] args) {
		Date date = new Date(12345689l);
		String objectString = "原型对象----";
		String objectString2 = "新对象----";
        Sheep s1 = new Sheep("多利",date);
        System.out.println(objectString + s1);
        System.out.println(objectString + s1.getName());
        System.out.println(objectString + s1.getBirthday());
        System.out.println("________________________________");
        try {
			Sheep s2 = (Sheep) s1.clone();
			date.setTime(345466578887l);
			System.out.println(objectString2 + s2);
			System.out.println(objectString2 + s2.getName());
			System.out.println(objectString2 + s2.getBirthday());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
