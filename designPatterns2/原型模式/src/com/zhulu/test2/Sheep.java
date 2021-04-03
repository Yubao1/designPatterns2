package com.zhulu.test2;

import java.util.Date;

public class Sheep implements Cloneable{
    private String name;
    private Date birthday;
    
    public Sheep() {
    	System.out.println("Sheep类对象无参构造方法");
    }
    
	public Sheep(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
		System.out.println("Sheep类对象有2个参数的构造方法");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Object object = super.clone();
		Sheep sheep = (Sheep) object;
		sheep.birthday = (Date) this.birthday.clone();
		return object;
	}
    
}
