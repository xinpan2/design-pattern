package com.xinpaninjava.decorator;

/**
 * ����װ����:���з���Ч����װ��
 */
public class FlyDecorator extends Decorator {
	/**
	 * ���캯��
	 * 
	 * @param car
	 */
	public FlyDecorator(ICar car) {
		super(car);
	}

	/**
	 * ��������
	 */
	@Override
	public void run() {
		System.out.println("run~~~~~~~~~~~");
	}

	/**
	 * ���з���
	 */
	public void fly() {
		System.out.println("fly~~~~!");
	}

	/**
	 * չʾ���ܷ���
	 */
	@Override
	public void show() {
		this.getCar().show();
		this.fly();
	}

}
