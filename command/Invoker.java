package com.xinpaninjava.command;

import java.util.List;

/**
 * �������
 * 
 * ���ж����������:�ڴ�������ʱ�Ѿ�����������úã�Ҳ����ͨ�����캯��������
 */
public class Invoker {
	// ������������
	private List<Command> commands;

	/**
	 * ��������
	 */
	public void order() {
		for (Command command : this.commands) {
			command.execute();
		}
	}

	/**
	 * ���캯��
	 * 
	 * @param commands
	 *            ����Ķ���������
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
