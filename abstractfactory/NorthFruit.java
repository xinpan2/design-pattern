package com.xinpaninjava.abstractfactory;

/**
 * 具体工厂--设定具体产品族，比如这里的北方水果
 */
public class NorthFruit implements FruitFactory {

	public Fruit getApple() {

		return new NorthApple();
	}

	public Fruit getBanana() {

		return new NorthBanana();
	}

}
