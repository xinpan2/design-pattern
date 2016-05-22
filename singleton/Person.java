package com.xinpaninjava.singleton;


/**
 * ����ʽ���������ʱ�������ʹ����Լ���ʵ����������
 */
public class Person {
	private static final Person PERSON = new Person();

	private String name;

	// ���ع��캯��
	private Person() {
	}

	// ��̬��ȡʵ������
	public static Person getInstance() {
		return PERSON;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
