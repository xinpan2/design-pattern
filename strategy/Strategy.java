package com.xinpaninjava.strategy;

/**
 * 策略 模式的抽象接口：用来抽取出具体实现的公共行为
 */
public interface Strategy {
	public double getPrice(double originalPrice);
}
