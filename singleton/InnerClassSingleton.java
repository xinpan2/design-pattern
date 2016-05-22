package com.xinpaninjava.singleton;

/**
 * 静态内部类实现延迟加载（lazy loading）
 */
public class InnerClassSingleton {
	// 静态内部类
	private static final class InnerClassSingletonImpl {
		static InnerClassSingleton singleton = new InnerClassSingleton();
	}

	// 隐藏构造函数
	private InnerClassSingleton() {
	}

	// 提供静态获取实例方法
	public static InnerClassSingleton getInstance() {
		// 当调用获取实例方法时，要调用内部类来获取实例
		return InnerClassSingletonImpl.singleton;
	}
}
