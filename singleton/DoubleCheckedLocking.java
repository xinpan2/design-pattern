package com.xinpaninjava.singleton;

/**
 * ˫��У����ʵ�ֵ���ģʽ
 * 
 * ���ַ����ڸ���ͬ�������У��¼���һ���жϣ���Ϊ�˷�ֹ�ж���߳�ͬʱ����if�����
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
