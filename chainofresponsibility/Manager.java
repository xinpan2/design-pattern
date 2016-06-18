package com.xinpaninjava.chainofresponsibility;

/**
 * ���ž����ࣺ���ڴ������������ [3,10)��ļ���
 */
public class Manager extends Leader {
	/**
	 * ͨ�����캯�����쵼����������
	 * 
	 * @param name
	 *            �쵼������
	 */
	public Manager(String name) {
		super(name);
	}

	/**
	 * ����������ľ���ʵ�ַ���
	 * 
	 * ��ǰ�ǲ��ž����࣬���ڴ������������ [3,10)��ļ�����
	 * 
	 * �������10�죬������̶�����
	 */
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getDays() < 10) {
			System.out.println("������" + leaveRequest.getEmployeeName()
					+ ",�������:" + leaveRequest.getDays() + ",���ɣ�"
					+ leaveRequest.getReason());
			System.out.println("�����ˣ�" + this.name + "���ž���");
		} else {
			// ��������������10�Һ�̴������Ϊ�գ�����̶�����
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(leaveRequest);
			}
		}
	}

}
