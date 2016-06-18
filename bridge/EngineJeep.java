package com.xinpaninjava.bridge;

/**
 * Jeep的具体实现类，具体安装哪种引擎，还要看传进来的引擎实例
 */
public class EngineJeep extends Jeep {
	/**
	 * 在调用这个方法时，把指定的引擎传进来
	 * 
	 * @param engine
	 *            具体引擎对象
	 */
	public EngineJeep(Engine engine) {
		super(engine);
	}

	/**
	 * 安装具体的引擎
	 */
	@Override
	public void installEngine() {
		this.getEngine().installEngine();
	}

}
