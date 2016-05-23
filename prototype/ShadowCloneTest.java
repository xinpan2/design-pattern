package com.xinpaninjava.prototype;

import java.util.ArrayList;

/**
 * ǳ��¡������
 * 
 * ʲô��ǳ��¡��
 * 
 * ����ԭ���������������ԣ�������clone������û������Ӧ�Ĵ����ڿ�¡�Ķ����еõ�����ͬ��������
 * 
 * ������������У�ԭ���������������list�����޸ģ��ÿ�¡������ʵ������һ������
 * 
 * �������ʵ�������list��һ����˵�������ǳ��¡
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

		// ��ԭ�ȵĻ���������һ������
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

		// �ж϶����Ƿ����
		System.out
				.println("-------------person compares with person.clone()----------------");
		System.out.println(person1 == person2 ? "these objects are  equal"
				: "these objects aren't equal");
	}
}
