package com.xinpaninjava.strategy;

/**
 * �Ϲ˿͹���������Ʒ�Ĵ����㷨
 * 
 */
public class RegularCustomerFew implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		System.out.println("�����");
		return originalPrice * 0.9;
	}

}
