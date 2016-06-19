package com.xinpaninjava.state;

/**
 * 状态模式的状态接口，用来定义状态需要实现的公共行为：不同状态的不同处理方式
 * 
 * 不同的具体对象只要实现这个接口就可以覆写这个具体的处理方法
 */
public interface State {
	/**
	 * 具体处理方式
	 */
	public void handle();
}
