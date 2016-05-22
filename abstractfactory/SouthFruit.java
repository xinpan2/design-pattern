package com.xinpaninjava.abstractfactory;

/**
 * 具体工厂--设定具体产品族，比如这里的北方水果
 */
public class SouthFruit implements FruitFactory {

	public Fruit getApple() {

		return new SouthApple();
	}

	public Fruit getBanana() {

		return new SouthBanana();
	}

}
