package com.xinpaninjava.singleton;

/**
 * 懒汉式
 * 
 *1、隐藏构造函数
 * 
 *2、创建一个该类实例的引用
 * 
 *3、设计静态获取实例方法
 */
public class LazySingleton {
	private LazySingleton() {
	}

	private static LazySingleton singleton;

	/*
	 * 设计获取实例方法
	 * 
	 * 1、判断实例引用是否为空
	 * 
	 * 2.1、为空，new一个返回
	 * 
	 * 2.2、非空，直接返回引用
	 */
	public static LazySingleton getInstance() {

		if (singleton == null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
