package com.xinpaninjava.prototype;

import java.util.ArrayList;

/**
 * 原型设计模式
 * 
 * 对应的类需要实现Cloneable接口，否则会抛出不支持克隆异常
 * 
 * 并且覆写父类的clone方法。
 */
public class Person implements Cloneable {
	private String name;
	private int age;
	private ArrayList<String> friends = new ArrayList<String>();

	@Override
	protected Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}

	// --------getter & setter-------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getFriends() {
		return friends;
	}

	public void setFriends(ArrayList<String> friends) {
		this.friends = friends;
	}

}
