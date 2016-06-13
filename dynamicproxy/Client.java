package com.xinpaninjava.dynamicproxy;

/**
 * ��̬���������:ͨ������Handler��������ô�����ʵ�����ҵ�����ط���
 */
public class Client {

	public static void main(String[] args) {
		// ������ʵ��
		UsermManagerImpl usermManagerImpl = new UsermManagerImpl();

		// �����ദ��ʵ��
		MyHandler myHandler = new MyHandler();

		// ��ô�����
		UserManager manager = (UserManager) myHandler
				.getProxyInstance(usermManagerImpl);

		// ���ô�����
		manager.addUser("xinpan2", "password");
	}

}
