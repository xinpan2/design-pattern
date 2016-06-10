package com.xinpaninjava.strategy;

/**
 * 新顾客批量购买产品的处理算法
 * 
 */
public class NewCustomerMany implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		System.out.println("打九折");
		return originalPrice * 0.9;
	}

}
