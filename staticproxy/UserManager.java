package com.xinpaninjava.staticproxy;

/**
 * �û�����Ŀ�����ӿڣ�����ӿڶ���������뱻�����๫������Ϊ
 */
public interface UserManager {
	/**
	 * �����û�
	 */
	public void addUser(String userNanme, String password);

	/**
	 * �޸��û���Ϣ
	 */
	public void updateUser(int id, String userName, String password);

	/**
	 * ����idɾ���û�
	 */
	public void deleteUserById(int id);

	/**
	 * ����id�����û�
	 */
	public String findUserById(int id);

	/**
	 * ���������û�
	 */
	public String findAllUsers();
}
