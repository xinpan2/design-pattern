package com.xinpaninjava.bridge;

/**
 * ��ʿ�����ӿڣ����������ʿ���Ĺ�����Ϊ
 */
public abstract class Bus implements Car {
	// �����������
	private Engine engine;

	/**
	 * �������캯��������ľ���ʵ�ִ�����
	 */
	public Bus(Engine engine) {
		super();
		this.engine = engine;
	}

	/**
	 * Ϊ���ھ����ʿ�����еõ�����
	 */
	public Engine getEngine() {
		return engine;
	}

}
