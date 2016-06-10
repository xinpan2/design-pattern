package com.xinpaninjava.strategy;

/**
 * 策略模式测试类（也可以称为客户端）：在客户端中确定具体使用哪种策略算价钱
 */
public class Client {

	public static void main(String[] args) {
		// 创建具体的算法实现类对象
		RegularCustomerMany regularCustomerMany = new RegularCustomerMany();
		Context context = new Context(regularCustomerMany);

		System.out.println("应付价钱： " + context.getPrice(799));
	}

}
