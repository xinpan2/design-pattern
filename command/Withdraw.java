package com.xinpaninjava.command;

/**
 * 具体的命令类：撤退
 */
public class Withdraw implements Command {
	// 对战士的引用
	private Receiver receiver;

	/**
	 * 通过构造函数把战士传进来
	 * 
	 * @param receiver
	 */
	public Withdraw(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	/**
	 * 调用战士执行具体的命令
	 */
	@Override
	public void execute() {
		System.out.println("让战士撤退~!!!");
		receiver.execute();
	}

}
