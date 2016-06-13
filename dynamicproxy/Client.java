package com.xinpaninjava.dynamicproxy;

/**
 * 动态代理测试类:通过创建Handler对象来获得代理类实例并且调用相关方法
 */
public class Client {

	public static void main(String[] args) {
		// 具体类实例
		UsermManagerImpl usermManagerImpl = new UsermManagerImpl();

		// 代理类处理实例
		MyHandler myHandler = new MyHandler();

		// 获得代理类
		UserManager manager = (UserManager) myHandler
				.getProxyInstance(usermManagerImpl);

		// 调用代理方法
		manager.addUser("xinpan2", "password");
	}

}
