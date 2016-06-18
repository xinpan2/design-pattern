package com.xinpaninjava.chainofresponsibility;

/**
 * �ܾ����ࣺ���ڴ���20�����ϵļ���
 */
public class GeneralManager extends Leader {
	/**
	 * ͨ�����캯�����쵼����������
	 * 
	 * @param name
	 *            �쵼������
	 */
	public GeneralManager(String name) {
		super(name);
	}

	/**
	 * ����������ľ���ʵ�ַ���
	 * 
	 * ��ǰ���ܾ����࣬���ڴ������������ 20~30��ļ���������30�첻����
	 * 
	 */
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getDays() < 30) {
			System.out.println("������" + leaveRequest.getEmployeeName()
					+ ",�������:" + leaveRequest.getDays() + ",���ɣ�"
					+ leaveRequest.getReason());
			System.out.println("�����ˣ�" + this.name + "�ܾ���");
		} else {
			// ��������������30�죬�ܾ�
			System.out.println("�ܾ���٣��ѵ���" + leaveRequest.getEmployeeName()
					+ "������ˣ�");
		}
	}

}
