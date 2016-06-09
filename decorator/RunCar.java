package com.xinpaninjava.decorator;

/**
 * 对抽象产品类的简单实现
 */
public class RunCar implements ICar {
	/**
	 * 启动方法
	 */
	@Override
	public void run() {
		System.out.println("run ");
	}

	/**
	 * 展示功能方法
	 */
	@Override
	public void show() {
		this.run();
	}

}
