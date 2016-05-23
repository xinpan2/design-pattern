package com.xinpaninjava.prototype;

import java.util.ArrayList;

/**
 * 深克隆测试类
 * 
 * 这个类主要目的在于判断两个实例的引用对象是否指向相同地址
 * 
 */
public class DeepCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// 原型类
		DeepClone prototype = new DeepClone();
		prototype.setId("1");
		prototype.setQuantity(1);

		ArrayList<String> contentList = new ArrayList<String>();
		contentList.add("String");
		contentList.add("int");
		contentList.add("ArrayList");

		prototype.setContenList(contentList);

		// 克隆类
		DeepClone clonedObject = prototype.clone();
		ArrayList<String> clonedList = clonedObject.getContenList();
		clonedList.add("prototype");
		clonedObject.setContenList(clonedList);

		// 判断，如果不是指向同一地址，输出的内容肯定不一样
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
