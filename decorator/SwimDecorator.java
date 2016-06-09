package com.xinpaninjava.decorator;

/**
 * 具体装饰类:具有飞行效果的装饰
 */
public class SwimDecorator extends Decorator {
	/**
	 * 构造函数
	 * 
	 * @param car
	 */
	public SwimDecorator(ICar car) {
		super(car);
	}

	/**
	 * 启动方法
	 */
	@Override
	public void run() {
		System.out.println("run");
	}

	/**
	 * 展示功能方法
	 */
	@Override
	public void show() {
		this.getCar().show();
		this.swim();
	}

	/**
	 * 在水上飞行方法
	 */
	public void swim() {
		System.out.println("swim");
	}

}
