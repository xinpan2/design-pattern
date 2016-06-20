package com.xinpaninjava.command;

/**
 * 命令执行者：战士
 */
public class Receiver {
	/**
	 * 展示执行命令，可以在这里定义在执行命令前后要做的方法
	 */
	public void execute() {
		System.out.println("战士接到命令");
		System.out.println("战士准备执行命令……");
	}
}
