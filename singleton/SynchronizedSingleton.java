package com.xinpaninjava.singleton;

/**
 * ͬ���浥��ģʽ
 * 
 * ���ְ汾������ʽ�Ļ�ȡʵ�������еķ�������ͬ������������һ��
 */
public class SynchronizedSingleton {
	private SynchronizedSingleton() {
	}

	private static SynchronizedSingleton singleton;

	// ����synchronized�ؼ���
	public static synchronized SynchronizedSingleton getInstance() {
		if (singleton == null) {
			singleton = new SynchronizedSingleton();
		}
		return singleton;
	}
}
