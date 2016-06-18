package com.xinpaninjava.mediator;

/**
 * �н���ģʽ������
 * 
 * ���Ը����ŵĽ������з��������������ʽ�Ԥ�㣬�г��������������ʽ�
 */
public class MediatorTest {

	public static void main(String[] args) {
		// �ܾ���
		Mediator manager = new Manager();
		// �г���
		Department market = new Market(manager);
		// ����
		Department finacial = new Finacial(manager);
		// �з���
		Development development = new Development(manager);

		// �з��������������ʽ�Ԥ��
		development.submitRequest("finacial");
		System.out.println("=====================================");
		// �г��������������ʽ�
		market.submitRequest("finacial");

	}

}
