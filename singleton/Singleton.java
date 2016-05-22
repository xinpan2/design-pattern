package com.xinpaninjava.singleton;

/**
 * 利用jdk1.5对枚举的增强，来实现单例模式
 */
public enum Singleton {
	INSTANCE;
	public Singleton getInstance() {
		return INSTANCE;
	}

	public void show() {
		System.out.println("impl singleton by using enum");
	}
}
