package com.xinpaninjava.singleton;

import java.io.Serializable;

/**
 * ˫����У�������,û��ʵ��readResolve����
 * 
 * ʹ��volatile����ʵ�������ã������������˫����У���п��ܳ��ֵ�����������
 * 
 * �������ֵĴ��뻹��һ��
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
