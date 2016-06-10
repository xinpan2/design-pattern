package com.xinpaninjava.strategy;

/**
 * 传统实现多种算法选择的例子
 * 
 * 在客户端调用时，把标准价（即未打折的价）跟要选择的算法传进来
 * 
 * 在这里实现算法与逻辑的处理
 */
public class TraditionalImplementationMethod {

	public double getPrice(String type, double originalPrice) {

		if ("新顾客少量".equals(type)) {
			System.out.println("不打折");
			return originalPrice;
		} else if ("新顾客批量".equals(type)) {
			System.out.println("打九折");
			return originalPrice * 0.9;
		} else if ("老顾客少量".equals(type)) {
			System.out.println("打九折");
			return originalPrice * 0.9;
		} else if ("老顾客批量".equals(type)) {
			System.out.println("打八五折");
			return originalPrice * 0.85;
		} else {
			throw new RuntimeException("错误的顾客类型!");
		}
	}
}
