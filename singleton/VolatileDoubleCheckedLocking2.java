package com.xinpaninjava.singleton;

import java.io.Serializable;

/**
 * ˫����У�������,ʵ����readResolve����
 */
public class VolatileDoubleCheckedLocking2 implements Serializable {
	// readResolve����
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
