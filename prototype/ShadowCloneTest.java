package com.xinpaninjava.prototype;

import java.util.ArrayList;

/**
 * 浅克隆测试类
 * 
 * 什么叫浅克隆？
 * 
 * 就是原型类中有引用属性，但是在clone方法中没有做相应的处理，在克隆的对象中得到的是同样的引用
 * 
 * 在这个测试类中，原来的类的引用类型list不做修改，让克隆出来的实例新增一条数据
 * 
 * 如果两个实例输出的list都一样，说明这就是浅克隆
 */
public class ShadowCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person1 = new Person();
		person1.setName("aa");
		person1.setAge(20);
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("XinPan");
		friends.add("James");
		friends.add("Smith");
		friends.add("Mary");
		person1.setFriends(friends);

		// 在原先的基础上新增一条数据
		Person person2 = person1.clone();
		ArrayList<String> friends2 = person2.getFriends();
		friends2.add("Mike");
		person2.setFriends(friends2);

		System.out.println("-------------traverse----friends2----------------");
		for (String friend : person2.getFriends()) {
			System.out.println(friend);
		}
		System.out.println("-------------traverse----friends----------------");
		for (String friend : person1.getFriends()) {
			System.out.println(friend);
		}

		// 判断对象是否相等
		System.out
				.println("-------------person compares with person.clone()----------------");
		System.out.println(person1 == person2 ? "these objects are  equal"
				: "these objects aren't equal");
	}
}
