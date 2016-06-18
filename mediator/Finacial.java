package com.xinpaninjava.mediator;

/**
 * ����
 */
public class Finacial implements Department {
	// �Ծ����������
	private Mediator manager;

	/**
	 * ��ְ����
	 */
	@Override
	public void selfAction() {
		System.out.println("ͳ���ʽ𣬹�����񣬷���Ԥ���ʽ�~~~!");
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
	public Finacial(Mediator manager) {
		this.manager = manager;
		this.manager.regist("finacial", this);
	}

}
