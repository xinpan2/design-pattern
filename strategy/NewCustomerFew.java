package com.xinpaninjava.strategy;

/**
 * �¹˿͹���������Ʒ�Ĵ����㷨
 * 
 */
public class NewCustomerFew implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		System.out.println("������");
		return originalPrice;
	}

}
