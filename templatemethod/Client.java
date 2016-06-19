package com.xinpaninjava.templatemethod;

/**
 * ģ�巽��ģʽ�Ĳ�����
 * 
 * ����ʹ�������ڲ������ʽ��ģ��ĳһ������Ŀͻ�
 */
public class Client {

	public static void main(String[] args) {
		// �ͻ�1��ȡ��2000
		ProcessHandle client1 = new ProcessHandle() {

			@Override
			public void transact() {
				System.out.println("��Ҫȡ��2000Ԫ");
			}

		};
		// ��������
		client1.process();

		System.out.println("======================================");

		// �ͻ�2�����1000

		ProcessHandle client2 = new ProcessHandle() {

			@Override
			public void transact() {
				System.out.println("��Ҫ���1000Ԫ");
			}
		};
		// ��������
		client2.process();
	}

}
