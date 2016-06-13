package com.xinpaninjava.staticproxy;

/**
 * 用户管理的代理类-此类与用户管理的具体实现有共同的接口
 * 
 * 因为最终是由客户端调用，所以程序员可以修改真正的实现类而让用户觉得好像没变化一样
 * 
 * 在这里，由于需要为每个动作新增权限的判断，为了在不影响原有代码的前提下，使用静态代理，
 * 
 * 为每一个需要权限管理的方法调用权限管理
 * 
 */
public class UserManagerProxy implements UserManager {
	// 首先有一个具体实现的引用
	private UsermManagerImpl managerImpl;

	/**
	 * 通过构造函数把被代理类的实例传进来
	 * 
	 * @param managerImpl
	 *            被代理类的实例
	 */
	public UserManagerProxy(UsermManagerImpl managerImpl) {
		super();
		this.managerImpl = managerImpl;
	}

	/**
	 * 添加用户，首先经过判断是否有权限，再执行具体方法，如果不够权限，则不会继续进行下去
	 */
	@Override
	public void addUser(String userNanme, String password) {
		checkSecurity();
		// 如果权限足够，调用具体实现的方法
		managerImpl.addUser(userNanme, password);
	}

	/**
	 * 根据id删除用户，原理同上
	 */
	@Override
	public void deleteUserById(int id) {
		checkSecurity();
		managerImpl.deleteUserById(id);
	}

	/**
	 * 查找所有用户
	 */
	@Override
	public String findAllUsers() {
		checkSecurity();
		Object result = managerImpl.findAllUsers();
		return (String) result;
	}

	/**
	 * 根据id查找用户
	 */
	@Override
	public String findUserById(int id) {
		checkSecurity();
		Object result = managerImpl.findUserById(id);
		return (String) result;
	}

	/**
	 * 修改用户
	 */
	@Override
	public void updateUser(int id, String userName, String password) {
		checkSecurity();
		managerImpl.updateUser(id, userName, password);
	}

	/**
	 * 权限判断的方法
	 */
	private void checkSecurity() {
		System.out.println("进行权限判定~~~~~~~~~~~~~~~~~~！！！！！");
	}

}
