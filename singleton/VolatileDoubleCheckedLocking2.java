package com.xinpaninjava.singleton;

import java.io.Serializable;

/**
 * 双重锁校验改良版,实现了readResolve方法
 */
public class VolatileDoubleCheckedLocking2 implements Serializable {
	// readResolve方法
	public Object readResolve() {
		return singleton;
	}

	private static volatile VolatileDoubleCheckedLocking2 singleton;

	private VolatileDoubleCheckedLocking2() {
	}

	public static VolatileDoubleCheckedLocking2 getInstance() {
		if (singleton == null) {
			synchronized (VolatileDoubleCheckedLocking2.class) {
				if (singleton == null) {
					singleton = new VolatileDoubleCheckedLocking2();
				}
			}
		}
		return singleton;
	}
}
