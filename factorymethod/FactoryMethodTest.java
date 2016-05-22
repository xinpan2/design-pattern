package com.xinpaninjava.factorymethod;

/**
 * 工厂方法模式测试类
 */
public class FactoryMethodTest {

	public static void main(String[] args) {
		// 得到苹果实例
		AppleFactory af = new AppleFactory();
		Fruit apple = af.getFruit();
		apple.get();

		// 得到香蕉实例
		BananaFactory bf = new BananaFactory();
		Fruit banana = bf.getFruit();
		banana.get();
	}

}
