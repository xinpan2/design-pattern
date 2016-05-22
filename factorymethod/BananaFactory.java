package com.xinpaninjava.factorymethod;

/**
 * 具体工厂--香蕉工厂
 */
public class BananaFactory implements FruitFactory {

	public Fruit getFruit() {

		return new Banana();
	}

}
