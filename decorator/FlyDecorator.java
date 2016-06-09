package com.xinpaninjava.decorator;

/**
 * 具体装饰类:具有飞行效果的装饰
 */
public class FlyDecorator extends Decorator {
	/**
	 * 构造函数
	 * 
	 * @param car
	 */
	public FlyDecorator(ICar car) {
		super(car);
	}

	/**
	 * 启动方法
	 */
	@Override
	public void run() {
		System.out.println("run~~~~~~~~~~~");
	}

	/**
	 * 飞行方法
	 */
	public void fly() {
		System.out.println("fly~~~~!");
	}

	/**
	 * 展示功能方法
	 */
	@Override
	public void show() {
		this.getCar().show();
		this.fly();
	}

}
