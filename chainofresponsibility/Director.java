package com.xinpaninjava.chainofresponsibility;

/**
 * �����ࣺ�����������ĵ�һ������
 * 
 * �������������������3��ļ���
 * 
 */
public class Director extends Leader {
	/**
	 * ͨ�����캯�����쵼����������
	 * 
	 * @param name
	 *            �쵼������
	 */
	public Director(String name) {
		super(name);
	}

	/**
	 * ����������ľ���ʵ�ַ���
	 * 
	 * ��ǰ�������࣬��������3��ļ���������������죬������̶�����
	 */
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getDays() < 3) {
			System.out.println("������" + leaveRequest.getEmployeeName()
					+ ",�������:" + leaveRequest.getDays() + ",���ɣ�"
					+ leaveRequest.getReason());
			System.out.println("�����ˣ�" + this.name + "����");
		} else {
			// ��������������3�Һ�̴������Ϊ�գ�����̶�����
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(leaveRequest);
			}
		}
	}

}
