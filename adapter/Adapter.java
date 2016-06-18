package com.xinpaninjava.adapter;

/**
 * �����������������е�ת�������������ں����������������������������ʵ��ת������
 * 
 * ����������������ǰ���ǣ������������Ҫʵ��Ŀ��ӿ�
 * 
 * Ȼ��ͨ�����/�̳еķ�ʽʵ�ֱ�������
 * 
 */
public class Adapter implements Target {
	// ��ת����������
	private Adaptee adaptee;

	/**
	 * ʹ�ò����ࣺ������ͨ��ת�����������ڲ嵽�����������
	 * 
	 * ��ʱ�Ϳ�������������
	 */
	@Override
	public void useSocket() {
		System.out.println("ʹ���������~~!");
		this.adaptee.run();
	}

	/**
	 * ͨ�����캯���ѱ�������ഫ����
	 * 
	 * @param adaptee
	 *            ������
	 */
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

}
