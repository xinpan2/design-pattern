package com.xinpaninjava.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 处理代理类实例
 * 
 * 当调用代理类时，都会默认调用invoke方法
 * 
 */
public class MyHandler implements InvocationHandler {
	// 在这个类也要具体实现类的引用
	private Object targetObject;

	/**
	 * 获取代理类的实力，在此之前把具体实现类的实例传进来
	 */
	public Object getProxyInstance(Object targetObject) {
		this.targetObject = targetObject;
		/*
		 * Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces,
		 * InvocationHandler h)
		 * 
		 * 使用与目标类相同的类加载器
		 * 
		 * 与目标类相同实现的接口
		 * 
		 * 最后一个参数是invocationHandler ，只要把当前对象传过去即可，所以用this
		 */
		return Proxy.newProxyInstance(this.targetObject.getClass()
				.getClassLoader(),
				this.targetObject.getClass().getInterfaces(), this);

	}

	/**
	 * 调用所有代理方法时，都会默认调用这个方法做处理
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 权限管理，在调用相关代理方法时，都为默认为每一个方法添加权限管理
		checkSecurity();
		Object result = method.invoke(this.targetObject, args);
		return result;
	}

	/**
	 * 权限判断的方法
	 */
	private void checkSecurity() {
		System.out.println("进行权限判定~~~~~~~~~~~~~~~~~~！！！！！");
	}

}
