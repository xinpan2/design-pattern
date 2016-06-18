package com.xinpaninjava.mediator;

/**
 * �г���
 */
public class Market implements Department {
	// �о����������
	private Mediator manager;

	/**
	 * ��ְ����
	 */
	@Override
	public void selfAction() {
		System.out.println("���г�������Ŀ~!");
	}

	/**
	 * ���ܾ����ύ����
	 */
	@Override
	public void submitRequest(String departmentName) {
		this.manager.command(departmentName);
	}

	/**
	 * ���캯������ʼ������ʱ�Ѿ����ഫ�������Ұѵ�ǰ������ӵ�����������
	 * 
	 * @param manager
	 *            ������
	 */
	public Market(Mediator manager) {
		this.manager = manager;
		this.manager.regist("market", this);
	}

}
