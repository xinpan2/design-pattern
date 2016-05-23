package com.xinpaninjava.prototype;

import java.util.ArrayList;

/**
 * ���¡������
 * 
 * �������ҪĿ�������ж�����ʵ�������ö����Ƿ�ָ����ͬ��ַ
 * 
 */
public class DeepCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// ԭ����
		DeepClone prototype = new DeepClone();
		prototype.setId("1");
		prototype.setQuantity(1);

		ArrayList<String> contentList = new ArrayList<String>();
		contentList.add("String");
		contentList.add("int");
		contentList.add("ArrayList");

		prototype.setContenList(contentList);

		// ��¡��
		DeepClone clonedObject = prototype.clone();
		ArrayList<String> clonedList = clonedObject.getContenList();
		clonedList.add("prototype");
		clonedObject.setContenList(clonedList);

		// �жϣ��������ָ��ͬһ��ַ����������ݿ϶���һ��
		System.out
				.println("-------------traverse----contentList----------------");
		for (String content : prototype.getContenList()) {
			System.out.println(content);
		}
		System.out
				.println("-------------traverse----clonedList----------------");
		for (String content : clonedObject.getContenList()) {
			System.out.println(content);
		}
	}

}
