package com.xinpaninjava.bridge;

/**
 * 桥接模式测试类：创建引擎类实例，创建巴士类实例并把具体的引擎类型传入
 */
public class Client {

	public static void main(String[] args) {
		// 引擎类型
		Engine mediumEngine = new MediunEngine();
		Engine advancedEngine = new AdvancedEngine();

		// 汽车类型
		EngineBus bus = new EngineBus(mediumEngine);
		bus.installEngine();

		EngineBus bus2 = new EngineBus(advancedEngine);
		bus2.installEngine();
	}

}
