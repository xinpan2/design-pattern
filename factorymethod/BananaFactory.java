package com.xinpaninjava.factorymethod;

/**
 * ���幤��--�㽶����
 */
public class BananaFactory implements FruitFactory {

	public Fruit getFruit() {

		return new Banana();
	}

}
