package com.xinpaninjava.staticproxy;

/**
 * ��̬��������ࣺ����������Ķ����ҵ��ñ�������ķ���
 */
public class Client {

	public static void main(String[] args) {
		UserManager userManager = new UserManagerProxy(new UsermManagerImpl());
		userManager.addUser("xinpan", "myPassword");
	}

}
