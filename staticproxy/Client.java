package com.xinpaninjava.staticproxy;

/**
 * 静态代理测试类：创建代理类的对象并且调用被代理类的方法
 */
public class Client {

	public static void main(String[] args) {
		UserManager userManager = new UserManagerProxy(new UsermManagerImpl());
		userManager.addUser("xinpan", "myPassword");
	}

}
