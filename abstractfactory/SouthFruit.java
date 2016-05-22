package com.xinpaninjava.abstractfactory;

/**
 * ���幤��--�趨�����Ʒ�壬��������ı���ˮ��
 */
public class SouthFruit implements FruitFactory {

	public Fruit getApple() {

		return new SouthApple();
	}

	public Fruit getBanana() {

		return new SouthBanana();
	}

}
