package com.xinpaninjava.strategy;

/**
 * �Ϲ˿����������Ʒ�Ĵ����㷨
 * 
 */
public class RegularCustomerMany implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		System.out.println("�������");
		return originalPrice * 0.85;
	}

}
