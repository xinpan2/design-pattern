package com.xinpaninjava.simplefactory;

/**
 * �򵥹���ģʽ�Ĳ�����
 */
public class SimpleFactoryTest {

	public static void main(String[] args) {

		SimpleFactory.getFruit("apple").get();

		SimpleFactory.getFruit("banana").get();
	}

}
