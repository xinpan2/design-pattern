package com.xinpaninjava.decorator;

/**
 * �Գ����Ʒ��ļ�ʵ��
 */
public class RunCar implements ICar {
	/**
	 * ��������
	 */
	@Override
	public void run() {
		System.out.println("run ");
	}

	/**
	 * չʾ���ܷ���
	 */
	@Override
	public void show() {
		this.run();
	}

}
