package com.xinpaninjava.command;

/**
 * ����������ࣺ����
 */
public class Attack implements Command {
	// ��սʿ������
	private Receiver receiver;

	/**
	 * ͨ�����캯����սʿ������
	 * 
	 * @param receiver
	 */
	public Attack(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	/**
	 * ����սʿִ�о��������
	 */
	@Override
	public void execute() {
		System.out.println("��սʿ����~!!!");
		receiver.execute();
	}

}
