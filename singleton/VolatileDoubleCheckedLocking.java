package com.xinpaninjava.singleton;

import java.io.Serializable;

/**
 * 双重锁校验改良版,没有实现readResolve方法
 * 
 * 使用volatile修饰实例的引用，就能完美解决双重锁校验中可能出现的重排序问题
 * 
 * 其他部分的代码还是一样
 */
public class VolatileDoubleCheckedLocking implements Serializable {
	private static volatile VolatileDoubleCheckedLocking singleton;

	private VolatileDoubleCheckedLocking() {
	}

	public static VolatileDoubleCheckedLocking getInstance() {
		if (singleton == null) {
			synchronized (VolatileDoubleCheckedLocking.class) {
				if (singleton == null) {
					singleton = new VolatileDoubleCheckedLocking();
				}
			}
		}
		return singleton;
	}
}
