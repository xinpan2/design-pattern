package com.xinpaninjava.mediator;

/**
 * ��Ҫ����Ľ����ӿ�:���Žӿ�
 */
public interface Department {
	/**
	 * ĳ�����ŵı�ְ����
	 */
	public void selfAction();

	/**
	 * ���ܾ����ύ����
	 * 
	 * @param departmentName
	 *            Ŀ�겿����
	 */
	public void submitRequest(String departmentName);
}
