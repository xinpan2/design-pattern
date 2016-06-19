package com.xinpaninjava.state;

/**
 * 状态模式测试类：用于测试切换不同状态时的行为
 */
public class Client {

	public static void main(String[] args) {
		StateContext stateContext = new StateContext();

		// 第一种状态
		stateContext.setState(new UnBookedRoom());

		// 第二种状态
		stateContext.setState(new BookedRoom());

		// 第三种状态
		stateContext.setState(new CheckIn());
	}

}
