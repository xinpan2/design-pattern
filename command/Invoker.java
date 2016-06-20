package com.xinpaninjava.command;

import java.util.List;

/**
 * 命令发出者
 * 
 * 持有对命令的引用:在创建对象时把具体的命令设置好，也可以通过构造函数传进来
 */
public class Invoker {
	// 具体的命令对象
	private List<Command> commands;

	/**
	 * 发送命令
	 */
	public void order() {
		for (Command command : this.commands) {
			command.execute();
		}
	}

	/**
	 * 构造函数
	 * 
	 * @param commands
	 *            具体的多个命令对象
	 */
	public Invoker(List<Command> commands) {
		super();
		this.commands = commands;
	}

	// getter setter

	public List<Command> getCommands() {
		return commands;
	}

	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}

}
