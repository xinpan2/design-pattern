package com.xinpaninjava.mediator;

/**
 * �н�ӿڣ��н���ĳ���ӿڣ����������н���Ĺ�����Ϊ
 */
public interface Mediator {
	/**
	 * ע�Ჿ�ţ�������Ҫ�ܾ������Ĳ�����ӽ���
	 */
	public void regist(String name, Department department);

	/**
	 * ����ָ���Ĳ���ִ������
	 */
	public void command(String departmentName);
}
