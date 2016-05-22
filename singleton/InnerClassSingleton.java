package com.xinpaninjava.singleton;

/**
 * ��̬�ڲ���ʵ���ӳټ��أ�lazy loading��
 */
public class InnerClassSingleton {
	// ��̬�ڲ���
	private static final class InnerClassSingletonImpl {
		static InnerClassSingleton singleton = new InnerClassSingleton();
	}

	// ���ع��캯��
	private InnerClassSingleton() {
	}

	// �ṩ��̬��ȡʵ������
	public static InnerClassSingleton getInstance() {
		// �����û�ȡʵ������ʱ��Ҫ�����ڲ�������ȡʵ��
		return InnerClassSingletonImpl.singleton;
	}
}
