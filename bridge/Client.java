package com.xinpaninjava.bridge;

/**
 * �Ž�ģʽ�����ࣺ����������ʵ����������ʿ��ʵ�����Ѿ�����������ʹ���
 */
public class Client {

	public static void main(String[] args) {
		// ��������
		Engine mediumEngine = new MediunEngine();
		Engine advancedEngine = new AdvancedEngine();

		// ��������
		EngineBus bus = new EngineBus(mediumEngine);
		bus.installEngine();

		EngineBus bus2 = new EngineBus(advancedEngine);
		bus2.installEngine();
	}

}
