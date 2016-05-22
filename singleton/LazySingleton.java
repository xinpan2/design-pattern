package com.xinpaninjava.singleton;

/**
 * ����ʽ
 * 
 *1�����ع��캯��
 * 
 *2������һ������ʵ��������
 * 
 *3����ƾ�̬��ȡʵ������
 */
public class LazySingleton {
	private LazySingleton() {
	}

	private static LazySingleton singleton;

	/*
	 * ��ƻ�ȡʵ������
	 * 
	 * 1���ж�ʵ�������Ƿ�Ϊ��
	 * 
	 * 2.1��Ϊ�գ�newһ������
	 * 
	 * 2.2���ǿգ�ֱ�ӷ�������
	 */
	public static LazySingleton getInstance() {

		if (singleton == null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
