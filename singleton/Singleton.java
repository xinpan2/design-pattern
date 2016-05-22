package com.xinpaninjava.singleton;

/**
 * ����jdk1.5��ö�ٵ���ǿ����ʵ�ֵ���ģʽ
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
