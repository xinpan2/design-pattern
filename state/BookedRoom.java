package com.xinpaninjava.state;

/**
 * 具体的状态之一：已预定状态
 * 
 * 酒店房间处于已预定状态时，应该在系统中显示可以不能被预定
 */
public class BookedRoom implements State {

	@Override
	public void handle() {
		System.out.println("房间已被预订~~~~~等待入住或取消预定~~~!");
	}

}
