package com.xinpaninjava.strategy;

/**
 * ��ͳʵ�ֶ����㷨ѡ�������
 * 
 * �ڿͻ��˵���ʱ���ѱ�׼�ۣ���δ���۵ļۣ���Ҫѡ����㷨������
 * 
 * ������ʵ���㷨���߼��Ĵ���
 */
public class TraditionalImplementationMethod {

	public double getPrice(String type, double originalPrice) {

		if ("�¹˿�����".equals(type)) {
			System.out.println("������");
			return originalPrice;
		} else if ("�¹˿�����".equals(type)) {
			System.out.println("�����");
			return originalPrice * 0.9;
		} else if ("�Ϲ˿�����".equals(type)) {
			System.out.println("�����");
			return originalPrice * 0.9;
		} else if ("�Ϲ˿�����".equals(type)) {
			System.out.println("�������");
			return originalPrice * 0.85;
		} else {
			throw new RuntimeException("����Ĺ˿�����!");
		}
	}
}
