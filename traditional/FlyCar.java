package com.xinpaninjava.decorator.traditional;

/**
 * 为车新增飞行的功能
 */
public class FlyCar extends Car {
	/**
	 * 飞行方法
	 */
	public void fly() {
		System.out.println("飞行~~~~~~~~~~");
	}

	/**
	 * 展示当前功能
	 */
	@Override
	public void show() {
		super.show();
		this.fly();
	}
}
