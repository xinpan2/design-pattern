package com.xinpaninjava.strategy;

/**
 * 新顾客购买少量产品的处理算法
 * 
 */
public class NewCustomerFew implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		System.out.println("不打折");
		return originalPrice;
	}

}
