package com.xinpaninjava.decorator;

/**
 * 抽象产品类:把要添加功能的产品抽象成接口
 */
public interface ICar {
	/**
	 * 启动方法
	 */
	public void run();

	/**
	 * 展示功能
	 */
	public void show();
}
