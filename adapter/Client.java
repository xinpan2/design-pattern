package com.xinpaninjava.adapter;

/**
 * �����������ࣺͨ������ת������ʹ������������
 */
public class Client {

	public static void main(String[] args) {
		// �������ȵ�ʵ��
		Adaptee fan = new Adaptee();
		// ������������ʵ����ʹ���������
		Target adapter = new Adapter(fan);
		adapter.useSocket();
	}

}
