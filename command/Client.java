package com.xinpaninjava.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式测试类
 * 
 * 通过一系列命令的发送来一次性执行操作
 */
public class Client {

	public static void main(String[] args) {
		// 先创建命令执行者对象
		Receiver solider = new Receiver();
		// 创建具体的命令
		Command attack = new Attack(solider);
		Command withdraw = new Withdraw(solider);
		Command defend = new Defend(solider);
		List<Command> commands = new ArrayList<Command>();
		commands.add(attack);
		commands.add(withdraw);
		commands.add(defend);
		// 再把一系列要发送的命令放在集合中一起发送
		Invoker chairman = new Invoker(commands);
		// 发送命令
		chairman.order();
	}

}
