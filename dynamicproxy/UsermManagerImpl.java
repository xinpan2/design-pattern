package com.xinpaninjava.dynamicproxy;

/**
 * �������ࣺ�û�����ľ���ʵ����
 * 
 * ������ʵ��ֻ�Ǽ򵥵������˭ִ��
 */
public class UsermManagerImpl implements UserManager {
	/**
	 * �����û�
	 */
	@Override
	public void addUser(String userNanme, String password) {
		System.out.println("UsermManagerImpl.addUser()");
	}

	/**
	 * ����idɾ���û�
	 */
	@Override
	public void deleteUserById(int id) {
		System.out.println("UsermManagerImpl.deleteUserById()");
	}

	/**
	 * ���������û�
	 */
	@Override
	public String findAllUsers() {
		System.out.println("UsermManagerImpl.findAllUserd()");
		return "user1,user2,user3,...,usern";
	}

	/**
	 * ����id�����û�
	 */
	@Override
	public String findUserById(int id) {
		System.out.println("UsermManagerImpl.findUserById()");
		return "user";
	}

	/**
	 * �޸��û���Ϣ
	 */
	@Override
	public void updateUser(int id, String userName, String password) {
		System.out.println("UsermManagerImpl.updateUser()");
	}

}
