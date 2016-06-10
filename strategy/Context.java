package com.xinpaninjava.strategy;

/**
 * 策略模式逻辑处理类 ：通过这个类来调用具体的实现算法
 */
public class Context {
	// 对策略对象的引用
	private Strategy strategy;

	// 在构造函数中传入具体的策略对象
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	// 得到最终价格
	public double getPrice(double originalPrice) {
		return this.strategy.getPrice(originalPrice);
	}
}
