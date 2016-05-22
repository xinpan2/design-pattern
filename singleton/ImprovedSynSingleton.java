package com.xinpaninjava.singleton;

/**
 * ����������ʽ
 * 
 * ����ʵ�ַ�ʽֻ�ǰ���Ҫͬ���Ĵ��뷶Χ������������С���ض�������
 * 
 * ����ÿ�ε��û�ȡʵ����Ҫ�ж� ���԰�ͬ����ӵ�����ʵ����һ�д���
 */
public class ImprovedSynSingleton {

	private ImprovedSynSingleton() {
	}

	private static ImprovedSynSingleton singleton;

	public static ImprovedSynSingleton getInstance() {

		if (singleton == null) {

			synchronized (ImprovedSynSingleton.class) {
				singleton = new ImprovedSynSingleton();
			}
		}
		return singleton;
	}
}
