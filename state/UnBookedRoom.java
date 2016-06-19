package com.xinpaninjava.state;

/**
 * 具体的状态之一：未预定状态
 * 
 * 酒店房间处于未预定状态时，应该在系统中显示可以被预定
 */
public class UnBookedRoom implements State {

	@Override
	public void handle() {
		System.out.println("当前房间未被预定，顾客可以预定~!");
	}

}
