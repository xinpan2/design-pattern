package com.xinpaninjava.state;

/**
 * 酒店房间状态的上下文：用户状态间的切换
 * 
 * 引用对象state代表当前的状态
 */
public class StateContext {

	private State state;

	public State getState() {
		return state;
	}

	/**
	 * 状态的切换
	 */
	public void setState(State state) {
		this.state = state;
		System.out.println("状态修改成功");
		this.state.handle();
	}

}
