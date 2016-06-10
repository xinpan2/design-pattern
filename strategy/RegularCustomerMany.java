package com.xinpaninjava.strategy;

/**
 * 老顾客批量购买产品的处理算法
 * 
 */
public class RegularCustomerMany implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		System.out.println("打八五折");
		return originalPrice * 0.85;
	}

}
