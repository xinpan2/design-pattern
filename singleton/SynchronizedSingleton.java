package com.xinpaninjava.singleton;

/**
 * 同步版单例模式
 * 
 * 这种版本对懒汉式的获取实例方法中的方法进行同步，其他代码一致
 */
public class SynchronizedSingleton {
	private SynchronizedSingleton() {
	}

	private static SynchronizedSingleton singleton;

	// 增加synchronized关键字
	public static synchronized SynchronizedSingleton getInstance() {
		if (singleton == null) {
			singleton = new SynchronizedSingleton();
		}
		return singleton;
	}
}
