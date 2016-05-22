package com.xinpaninjava.singleton;

/**
 * 双重校验锁实现单例模式
 * 
 * 这种方法在改良同步方法中，新加了一个判断，是为了防止有多个线程同时进入if代码块
 */
public class DoubleCheckedLocking {
	private static DoubleCheckedLocking singleton;

	private DoubleCheckedLocking() {
	}

	public static DoubleCheckedLocking getInstance() {
		if (singleton == null) {
			synchronized (DoubleCheckedLocking.class) {
				if (singleton == null) {
					singleton = new DoubleCheckedLocking();
				}
			}
		}
		return singleton;
	}
}
