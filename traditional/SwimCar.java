package com.xinpaninjava.decorator.traditional;

/**
 * ������ˮ���ܵĳ�
 */
public class SwimCar extends Car {
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
		this.swim();
	}
}
