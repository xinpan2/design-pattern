package com.xinpaninjava.singleton;

/**
 * ����ʽ���Դ���
 * 
 * �����������󣬲��Ҷ������Ը���ͬ��ֵ���鿴�Ƿ����
 */
public class LazySingletonTest {

	public static void main(String[] args) {
		LazySingleton singleton1 = LazySingleton.getInstance();
		singleton1.setId("123");

		LazySingleton singleton2 = LazySingleton.getInstance();
		singleton2.setId("456");

		System.out.println(singleton1 == singleton2);
		System.out.println("lazySingleton 1 " + singleton1.getId());
		System.out.println("lazySingleton 2 " + singleton2.getId());

	}

}
