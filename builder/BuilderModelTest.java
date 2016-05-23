package com.xinpaninjava.builder;

/**
 * 建造者模式的测试类
 * 
 * 这个类分别对平房、公寓的建设测试。
 * 
 * 从测试类的调用来看，步骤简洁，并且代码结构实现了很好的分层
 */
public class BuilderModelTest {
	public static void main(String[] args) {
		// 1、普通房子
		BungalowBuilder bungalowBuilder = new BungalowBuilder();
		Director director = new Director();
		System.out.println("bungalow:\n" + director.Design(bungalowBuilder));

		System.out
				.println("------------------------------------------------------------------");
		// 2、公寓
		ApartmentBuilder apartmentBuilder = new ApartmentBuilder();

		System.out.println("apartment:\n" + director.Design(apartmentBuilder));

	}
}
