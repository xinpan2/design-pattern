package com.xinpaninjava.templatemethod;

/**
 * ���пͻ����̴���ģ��
 * 
 * ������������й�����Ա���ڿͻ���������̴����ͳһ����
 */
public abstract class ProcessHandle {
	// ���к��룬���ڼ�¼��ǰ�ڼ����Ŷ��û�
	private static int sequenceNumber;

	/**
	 * ���⿪��ȡ�ŷ���
	 * 
	 * ���ú����һ���������ǰ�ǵڼ����ͻ�
	 */
	public void getSequenceNumber() {
		sequenceNumber++;
		System.out.println("�����ڵڣ�" + sequenceNumber + "λ");
	}

	/**
	 * ����Ҫ�����ҵ�����������óɳ��󷽷����������ʵ��
	 */
	public abstract void transact();

	/**
	 * �Ա��η��������
	 */
	public void comment() {
		System.out.println("�����������Կͷ���������");
	}

	/**
	 * ���ڹ涨����ִ�е�˳�򣬲��Ҳ��ܱ����าд�����̷���
	 */
	public final void process() {
		// ȡ��
		this.getSequenceNumber();
		// �������ҵ��
		this.transact();
		// �ύ����
		this.comment();
	}
}
