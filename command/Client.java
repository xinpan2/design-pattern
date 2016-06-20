package com.xinpaninjava.command;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ģʽ������
 * 
 * ͨ��һϵ������ķ�����һ����ִ�в���
 */
public class Client {

	public static void main(String[] args) {
		// �ȴ�������ִ���߶���
		Receiver solider = new Receiver();
		// �������������
		Command attack = new Attack(solider);
		Command withdraw = new Withdraw(solider);
		Command defend = new Defend(solider);
		List<Command> commands = new ArrayList<Command>();
		commands.add(attack);
		commands.add(withdraw);
		commands.add(defend);
		// �ٰ�һϵ��Ҫ���͵�������ڼ�����һ����
		Invoker chairman = new Invoker(commands);
		// ��������
		chairman.order();
	}

}
