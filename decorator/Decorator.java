package com.xinpaninjava.decorator;

/**
 * ����װ���� ���Ѿ���װ���๲ͬ����Ϊ�����������ʵ�ֳ����Ʒ��
 */
public abstract class Decorator implements ICar {
	// �Բ�Ʒ�������
	private ICar car;

	/**
	 * ���캯��
	 * 
	 * @param car
	 */
	public Decorator(ICar car) {
		this.car = car;
	}

	public ICar getCar() {
		return car;
	}

	public void setCar(ICar car) {
		this.car = car;
	}

}
