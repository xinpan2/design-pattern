package com.xinpaninjava.factorymethod;

/**
 * ���幤����ƻ������
 * 
 */
public class AppleFactory implements FruitFactory {

	public Fruit getFruit() {

		return new Apple();
	}

}
