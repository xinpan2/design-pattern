package com.xinpaninjava.strategy;

/**
 * ����ģʽ�����ࣨҲ���Գ�Ϊ�ͻ��ˣ����ڿͻ�����ȷ������ʹ�����ֲ������Ǯ
 */
public class Client {

	public static void main(String[] args) {
		// ����������㷨ʵ�������
		RegularCustomerMany regularCustomerMany = new RegularCustomerMany();
		Context context = new Context(regularCustomerMany);

		System.out.println("Ӧ����Ǯ�� " + context.getPrice(799));
	}

}
