package com.xinpaninjava.flyweight;

/**
 * ������Ԫ��
 */
public class ConcreteChess implements Chess {
	// ��Ҫ��������ԣ����ӵ���ɫ
	private String color;

	/**
	 * �����ǰ����ɫ��λ��
	 */
	@Override
	public void display(Coordinate coordinate) {
		System.out.println("��ɫ��" + this.color + "(" + coordinate.getX() + ","
				+ coordinate.getY() + ")");
	}

	/**
	 * ���캯����ͨ������ɫ�������������������������Ԫ��������
	 */
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

}
