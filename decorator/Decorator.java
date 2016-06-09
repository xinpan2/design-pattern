package com.xinpaninjava.decorator;

/**
 * 抽象装饰类 ：把具体装饰类共同的行为抽象出来，并实现抽象产品类
 */
public abstract class Decorator implements ICar {
	// 对产品类的引用
	private ICar car;

	/**
	 * 构造函数
	 * 
	 * @param car
	 */
	public Decorator(ICar car) {
		this.car = car;
	}

	public ICar getCar() {
		return car;
	}

	public void setCar(ICar car) {
		this.car = car;
	}

}
