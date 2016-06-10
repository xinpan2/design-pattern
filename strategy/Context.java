package com.xinpaninjava.strategy;

/**
 * ����ģʽ�߼������� ��ͨ������������þ����ʵ���㷨
 */
public class Context {
	// �Բ��Զ��������
	private Strategy strategy;

	// �ڹ��캯���д������Ĳ��Զ���
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	// �õ����ռ۸�
	public double getPrice(double originalPrice) {
		return this.strategy.getPrice(originalPrice);
	}
}
