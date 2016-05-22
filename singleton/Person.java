package com.xinpaninjava.singleton;


/**
 * 饿汉式：当类加载时，这个类就创建自己的实例而得名。
 */
public class Person {
	private static final Person PERSON = new Person();

	private String name;

	// 隐藏构造函数
	private Person() {
	}

	// 静态获取实例方法
	public static Person getInstance() {
		return PERSON;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
