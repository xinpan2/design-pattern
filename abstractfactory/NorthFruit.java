package com.xinpaninjava.abstractfactory;

/**
 * ���幤��--�趨�����Ʒ�壬��������ı���ˮ��
 */
public class NorthFruit implements FruitFactory {

	public Fruit getApple() {

		return new NorthApple();
	}

	public Fruit getBanana() {

		return new NorthBanana();
	}

}
