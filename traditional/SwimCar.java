package com.xinpaninjava.decorator.traditional;

/**
 * 可以在水上跑的车
 */
public class SwimCar extends Car {
	/**
	 * 在水上跑方法
	 */
	public void swim() {
		System.out.println("在水上跑");
	}

	/**
	 * 展示功能方法
	 */
	@Override
	public void show() {

		super.show();
		this.swim();
	}
}
