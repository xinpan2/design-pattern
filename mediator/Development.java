package com.xinpaninjava.mediator;

/**
 * �з���
 */
public class Development implements Department {
	// �Ծ����������
	private Mediator manager;

	/**
	 * ��ְ����
	 */
	@Override
	public void selfAction() {
		System.out.println("������Ŀ~~~!");
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
	public Development(Mediator manager) {
		this.manager = manager;
		this.manager.regist("development", this);
	}

}
