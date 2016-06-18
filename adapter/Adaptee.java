package com.xinpaninjava.adapter;

/**
 * 需要被“转换”的类，比如例子中的两针插口
 */
public class Adaptee {
	/**
	 * 启动风扇
	 */
	public void run() {
		System.out.println("风扇启动了~~~~!");
	}
}
