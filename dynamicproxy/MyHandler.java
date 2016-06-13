package com.xinpaninjava.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ���������ʵ��
 * 
 * �����ô�����ʱ������Ĭ�ϵ���invoke����
 * 
 */
public class MyHandler implements InvocationHandler {
	// �������ҲҪ����ʵ���������
	private Object targetObject;

	/**
	 * ��ȡ�������ʵ�����ڴ�֮ǰ�Ѿ���ʵ�����ʵ��������
	 */
	public Object getProxyInstance(Object targetObject) {
		this.targetObject = targetObject;
		/*
		 * Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces,
		 * InvocationHandler h)
		 * 
		 * ʹ����Ŀ������ͬ���������
		 * 
		 * ��Ŀ������ͬʵ�ֵĽӿ�
		 * 
		 * ���һ��������invocationHandler ��ֻҪ�ѵ�ǰ���󴫹�ȥ���ɣ�������this
		 */
		return Proxy.newProxyInstance(this.targetObject.getClass()
				.getClassLoader(),
				this.targetObject.getClass().getInterfaces(), this);

	}

	/**
	 * �������д�����ʱ������Ĭ�ϵ����������������
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// Ȩ�޹����ڵ�����ش�����ʱ����ΪĬ��Ϊÿһ���������Ȩ�޹���
		checkSecurity();
		Object result = method.invoke(this.targetObject, args);
		return result;
	}

	/**
	 * Ȩ���жϵķ���
	 */
	private void checkSecurity() {
		System.out.println("����Ȩ���ж�~~~~~~~~~~~~~~~~~~����������");
	}

}
