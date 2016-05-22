package com.xinpaninjava.singleton;

/**
 * 改良版懒汉式
 * 
 * 这种实现方式只是把需要同步的代码范围从整个方法缩小到特定代码行
 * 
 * 由于每次调用获取实例都要判断 所以把同步添加到创建实例那一行代码
 */
public class ImprovedSynSingleton {

	private ImprovedSynSingleton() {
	}

	private static ImprovedSynSingleton singleton;

	public static ImprovedSynSingleton getInstance() {

		if (singleton == null) {

			synchronized (ImprovedSynSingleton.class) {
				singleton = new ImprovedSynSingleton();
			}
		}
		return singleton;
	}
}
