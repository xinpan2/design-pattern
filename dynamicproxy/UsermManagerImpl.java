package com.xinpaninjava.dynamicproxy;

/**
 * 被代理类：用户管理的具体实现类
 * 
 * 方法的实现只是简单的输出由谁执行
 */
public class UsermManagerImpl implements UserManager {
	/**
	 * 增加用户
	 */
	@Override
	public void addUser(String userNanme, String password) {
		System.out.println("UsermManagerImpl.addUser()");
	}

	/**
	 * 根据id删除用户
	 */
	@Override
	public void deleteUserById(int id) {
		System.out.println("UsermManagerImpl.deleteUserById()");
	}

	/**
	 * 查找所有用户
	 */
	@Override
	public String findAllUsers() {
		System.out.println("UsermManagerImpl.findAllUserd()");
		return "user1,user2,user3,...,usern";
	}

	/**
	 * 根据id查找用户
	 */
	@Override
	public String findUserById(int id) {
		System.out.println("UsermManagerImpl.findUserById()");
		return "user";
	}

	/**
	 * 修改用户信息
	 */
	@Override
	public void updateUser(int id, String userName, String password) {
		System.out.println("UsermManagerImpl.updateUser()");
	}

}
