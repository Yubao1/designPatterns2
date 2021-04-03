package com.xe.adapter;

public class Test {

	public static void main(String[] args) {
       Test test = new Test();
       test.test();
       test.test2();
	}
	
	/**
	 * 测试 对象适配器模式
	 */
	private void test2() {
		AdapteeClass adapteeClass = new AdapteeClass();
		TargetInterface targetInterface = new Adapter2Class(adapteeClass);
		targetInterface.request();
	}
	
	/**
	 * 测试 类适配器模式
	 */
	private void test() {
		TargetInterface targetInterface = new AdapterClass();
		targetInterface.request();
	}

}
