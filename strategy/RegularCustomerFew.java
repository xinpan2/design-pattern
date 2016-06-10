package com.xinpaninjava.strategy;

/**
 * 老顾客购买少量产品的处理算法
 * 
 */
public class RegularCustomerFew implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		System.out.println("打九折");
		return originalPrice * 0.9;
	}

}
