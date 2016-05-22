package com.xinpaninjava.singleton;

/**
 * 测试枚举实现的单例模式
 */
public class SingletonTest {

	public static void main(String[] args) {
		Singleton singleton = Singleton.INSTANCE;

		Singleton singleton2 = Singleton.INSTANCE;

		System.out.println("singleton by using enum....");
		System.out.println(singleton == singleton2);
	}

}
