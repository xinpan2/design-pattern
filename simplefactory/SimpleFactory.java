package com.xinpaninjava.simplefactory;

/**
 * 工厂角色: 专门负责产生所有类的实例
 */
public class SimpleFactory {
	public static Fruit getFruit(String type) {
		// 判断要创建哪一种实例
		if ("apple".equalsIgnoreCase(type)) {
			return new Apple();
		} else if ("banana".equalsIgnoreCase(type)) {
			return new Banana();
		} else {
			// 若没有对应类型，抛异常
			throw new RuntimeException("no such type");
		}
	}
}
