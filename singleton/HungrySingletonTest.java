package com.xinpaninjava.singleton;

/**
 * 饿汉式测试代码
 * 
 * 创建两个person对象，并且对其属性赋不同的值，查看是否相等
 */
public class HungrySingletonTest {

	public static void main(String[] args) {
		Person person1 = Person.getInstance();
		person1.setName("aa");

		Person person2 = Person.getInstance();
		person2.setName("bb");

		// 比较两个对象是否相等
		System.out.println(person1 == person2);
		System.out.println("hungrySingleton  " + person1.getName());
		System.out.println("hungrySingleton  " + person2.getName());
	}

}
