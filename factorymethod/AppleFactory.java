package com.xinpaninjava.factorymethod;

/**
 * 具体工厂：苹果工厂
 * 
 */
public class AppleFactory implements FruitFactory {

	public Fruit getFruit() {

		return new Apple();
	}

}
