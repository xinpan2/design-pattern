package com.xinpaninjava.decorator.traditional;

/**
 * ��ͳ���Ӷ����ܵķ���
 */
public class Car {
	/**
	 * ��������
	 */
	public void run() {
		System.out.println("��½������~~~~~~~~~");
	}

	/**
	 * չʾ��ǰ����
	 */
	public void show() {
		this.run();
	}
}
