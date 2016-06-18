package com.xinpaninjava.chainofresponsibility;

/**
 * ���ܾ����ࣺ��������10-20��ļ���
 */
public class ViceGeneralManager extends Leader {

	/**
	 * ͨ�����캯�����쵼����������
	 * 
	 * @param name
	 *            �쵼������
	 */
	public ViceGeneralManager(String name) {
		super(name);
	}

	/**
	 * ����������ľ���ʵ�ַ���
	 * 
	 * ���ܾ����࣬���ڴ������������10-20��ļ�����
	 * 
	 * �������20�죬������̶�����
	 */
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getDays() < 20) {
			System.out.println("������" + leaveRequest.getEmployeeName()
					+ ",�������:" + leaveRequest.getDays() + ",���ɣ�"
					+ leaveRequest.getReason());
			System.out.println("�����ˣ�" + this.name + "���ܾ���");
		} else {
			// ��������������20�Һ�̴������Ϊ�գ�����̶�����
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(leaveRequest);
			}
		}
	}

}
