package com.xinpaninjava.decorator;

/**
 * ����װ����:���з���Ч����װ��
 */
public class SwimDecorator extends Decorator {
	/**
	 * ���캯��
	 * 
	 * @param car
	 */
	public SwimDecorator(ICar car) {
		super(car);
	}

	/**
	 * ��������
	 */
	@Override
	public void run() {
		System.out.println("run");
	}

	/**
	 * չʾ���ܷ���
	 */
	@Override
	public void show() {
		this.getCar().show();
		this.swim();
	}

	/**
	 * ��ˮ�Ϸ��з���
	 */
	public void swim() {
		System.out.println("swim");
	}

}
