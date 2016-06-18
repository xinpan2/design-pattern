package com.xinpaninjava.bridge.preexample;

/**
 * 实现了汽车抽象接口，定义具体安装引擎的实现方法
 */
public class BusMediumEngine extends Bus {

	@Override
	public void installEngine() {
		System.out.println("为Bus安装中配引擎");
	}

}
