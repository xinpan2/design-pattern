package com.xinpaninjava.decorator.traditional;

/**
 * 传统增加对象功能的方法
 */
public class Car {
	/**
	 * 启动方法
	 */
	public void run() {
		System.out.println("在陆地上跑~~~~~~~~~");
	}

	/**
	 * 展示当前功能
	 */
	public void show() {
		this.run();
	}
}
