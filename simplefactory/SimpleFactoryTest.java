package com.xinpaninjava.simplefactory;

/**
 * 简单工厂模式的测试类
 */
public class SimpleFactoryTest {

	public static void main(String[] args) {

		SimpleFactory.getFruit("apple").get();

		SimpleFactory.getFruit("banana").get();
	}

}
