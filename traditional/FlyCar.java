package com.xinpaninjava.decorator.traditional;

/**
 * Ϊ���������еĹ���
 */
public class FlyCar extends Car {
	/**
	 * ���з���
	 */
	public void fly() {
		System.out.println("����~~~~~~~~~~");
	}

	/**
	 * չʾ��ǰ����
	 */
	@Override
	public void show() {
		super.show();
		this.fly();
	}
}
