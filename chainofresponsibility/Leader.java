package com.xinpaninjava.chainofresponsibility;

/**
 * �쵼�ĳ����ࣺ���������쵼��Ĺ������Ժͷ���
 */
public abstract class Leader {
	// �쵼������
	protected String name;
	// �������еĺ�̶���
	protected Leader nextLeader;

	/**
	 *������ٵķ������ɾ����쵼ʵ��
	 * 
	 * @param leaveRequest
	 *            ���������
	 */
	public abstract void handleRequest(LeaveRequest leaveRequest);

	/**
	 * ͨ�����캯�����쵼����������
	 * 
	 * @param name
	 *            �쵼������
	 */
	public Leader(String name) {
		super();
		this.name = name;
	}

	/**
	 * �ṩ���ú�̶���ķ���
	 */
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

}
