package com.xinpaninjava.strategy;

/**
 * �¹˿����������Ʒ�Ĵ����㷨
 * 
 */
public class NewCustomerMany implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		System.out.println("�����");
		return originalPrice * 0.9;
	}

}
