package com.xinpaninjava.decorator.traditional;

/**
 * �ȿ��Էɣ��ֿ�����ˮ���ܵĳ�
 */
public class FlySwimCar extends Car {
	/**
	 * ���з���
	 */
	public void fly() {
		System.out.println("����");
	}

	/**
	 * ��ˮ���ܷ���
	 */
	public void swim() {
		System.out.println("��ˮ����");
	}

	/**
	 * չʾ���ܷ���
	 */
	@Override
	public void show() {

		super.show();
		this.fly();
		this.swim();
	}
}
