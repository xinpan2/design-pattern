package com.xinpaninjava.bridge;

/**
 * 巴士公共接口：用来定义巴士车的公共行为
 */
public abstract class Bus implements Car {
	// 对引擎的引用
	private Engine engine;

	/**
	 * 公共构造函数把引擎的具体实现传进来
	 */
	public Bus(Engine engine) {
		super();
		this.engine = engine;
	}

	/**
	 * 为了在具体巴士子类中得到引擎
	 */
	public Engine getEngine() {
		return engine;
	}

}
