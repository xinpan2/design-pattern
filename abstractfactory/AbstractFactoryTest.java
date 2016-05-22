package com.xinpaninjava.abstractfactory;

/**
 * 抽象工厂模式测试类
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		// 把四种水果都得到并执行对应的get方法
		// 产品族一
		FruitFactory factory1 = new NorthFruit();
		Fruit apple = factory1.getApple();
		apple.get();

		Fruit banana = factory1.getBanana();
		banana.get();
		// 产品族二
		FruitFactory factory2 = new SouthFruit();
		Fruit apple2 = factory2.getApple();
		apple2.get();

		Fruit banana2 = factory2.getBanana();
		banana2.get();

	}

}
