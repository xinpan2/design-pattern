package com.xinpaninjava.singleton;

/**
 * ����ʽ���Դ���
 * 
 * ��������person���󣬲��Ҷ������Ը���ͬ��ֵ���鿴�Ƿ����
 */
public class HungrySingletonTest {

	public static void main(String[] args) {
		Person person1 = Person.getInstance();
		person1.setName("aa");

		Person person2 = Person.getInstance();
		person2.setName("bb");

		// �Ƚ����������Ƿ����
		System.out.println(person1 == person2);
		System.out.println("hungrySingleton  " + person1.getName());
		System.out.println("hungrySingleton  " + person2.getName());
	}

}
