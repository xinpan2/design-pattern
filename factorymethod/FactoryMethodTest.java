package com.xinpaninjava.factorymethod;

/**
 * ��������ģʽ������
 */
public class FactoryMethodTest {

	public static void main(String[] args) {
		// �õ�ƻ��ʵ��
		AppleFactory af = new AppleFactory();
		Fruit apple = af.getFruit();
		apple.get();

		// �õ��㽶ʵ��
		BananaFactory bf = new BananaFactory();
		Fruit banana = bf.getFruit();
		banana.get();
	}

}
