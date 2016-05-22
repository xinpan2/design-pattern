package com.xinpaninjava.simplefactory;

/**
 * ������ɫ: ר�Ÿ�������������ʵ��
 */
public class SimpleFactory {
	public static Fruit getFruit(String type) {
		// �ж�Ҫ������һ��ʵ��
		if ("apple".equalsIgnoreCase(type)) {
			return new Apple();
		} else if ("banana".equalsIgnoreCase(type)) {
			return new Banana();
		} else {
			// ��û�ж�Ӧ���ͣ����쳣
			throw new RuntimeException("no such type");
		}
	}
}
