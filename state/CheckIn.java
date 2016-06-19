package com.xinpaninjava.state;

/**
 * 具体的状态之一：已入住
 * 
 * 酒店房间处于已入住状态时，应该在系统中显示可以退房、续房
 */
public class CheckIn implements State {

	@Override
	public void handle() {
		System.out.println("可以进行退房、续房操作 ~~~~!");
	}

}
