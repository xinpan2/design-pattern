package com.xinpaninjava.staticproxy;

/**
 * 用户管理：目标抽象接口，这个接口定义代理类与被代理类公共的行为
 */
public interface UserManager {
	/**
	 * 增加用户
	 */
	public void addUser(String userNanme, String password);

	/**
	 * 修改用户信息
	 */
	public void updateUser(int id, String userName, String password);

	/**
	 * 根据id删除用户
	 */
	public void deleteUserById(int id);

	/**
	 * 根据id查找用户
	 */
	public String findUserById(int id);

	/**
	 * 查找所有用户
	 */
	public String findAllUsers();
}
