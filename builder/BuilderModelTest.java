package com.xinpaninjava.builder;

/**
 * ������ģʽ�Ĳ�����
 * 
 * �����ֱ��ƽ������Ԣ�Ľ�����ԡ�
 * 
 * �Ӳ�����ĵ��������������࣬���Ҵ���ṹʵ���˺ܺõķֲ�
 */
public class BuilderModelTest {
	public static void main(String[] args) {
		// 1����ͨ����
		BungalowBuilder bungalowBuilder = new BungalowBuilder();
		Director director = new Director();
		System.out.println("bungalow:\n" + director.Design(bungalowBuilder));

		System.out
				.println("------------------------------------------------------------------");
		// 2����Ԣ
		ApartmentBuilder apartmentBuilder = new ApartmentBuilder();

		System.out.println("apartment:\n" + director.Design(apartmentBuilder));

	}
}
