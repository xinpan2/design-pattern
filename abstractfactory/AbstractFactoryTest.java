package com.xinpaninjava.abstractfactory;

/**
 * ���󹤳�ģʽ������
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		// ������ˮ�����õ���ִ�ж�Ӧ��get����
		// ��Ʒ��һ
		FruitFactory factory1 = new NorthFruit();
		Fruit apple = factory1.getApple();
		apple.get();

		Fruit banana = factory1.getBanana();
		banana.get();
		// ��Ʒ���
		FruitFactory factory2 = new SouthFruit();
		Fruit apple2 = factory2.getApple();
		apple2.get();

		Fruit banana2 = factory2.getBanana();
		banana2.get();

	}

}
