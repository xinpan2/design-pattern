package com.xinpaninjava.bridge.preexample;

/**
 * 拥有中配引擎的Jeep
 */
public class JeepMediumEngine extends Jeep {

	@Override
	public void installEngine() {
		System.out.println("为Jeep安装中配引擎~~！");
	}

}
