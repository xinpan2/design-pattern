package com.xinpaninjava.bridge;

/**
 * Jeep类汽车抽象类，用于定义Jeep类汽车的公共行为
 */
public abstract class Jeep implements Car {
	private Engine engine;

	/**
	 * 为了在具体Jeep子类中得到引擎
	 */
	public Engine getEngine() {
		return engine;
	}

	/**
	 * 通过构造函数把引擎的具体实现传进来
	 */
	public Jeep(Engine engine) {
		super();
		this.engine = engine;
	}

}
