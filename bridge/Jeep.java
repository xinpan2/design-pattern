package com.xinpaninjava.bridge;

/**
 * Jeep�����������࣬���ڶ���Jeep�������Ĺ�����Ϊ
 */
public abstract class Jeep implements Car {
	private Engine engine;

	/**
	 * Ϊ���ھ���Jeep�����еõ�����
	 */
	public Engine getEngine() {
		return engine;
	}

	/**
	 * ͨ�����캯��������ľ���ʵ�ִ�����
	 */
	public Jeep(Engine engine) {
		super();
		this.engine = engine;
	}

}
