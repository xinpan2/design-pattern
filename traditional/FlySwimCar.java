package com.xinpaninjava.decorator.traditional;

/**
 * 既可以飞，又可以在水上跑的车
 */
public class FlySwimCar extends Car {
	/**
	 * 飞行方法
	 */
	public void fly() {
		System.out.println("飞行");
	}

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
		this.fly();
		this.swim();
	}
}
