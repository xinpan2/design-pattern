package com.xinpaninjava.builder;

/**
 * �ذ�--��Ʒ�������֮һ
 * 
 *���������ֶζ��ǻ����������ͺ��ַ���
 */
public class Floor {

	private double length;
	private double width;
	private String color;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return " [color=" + color + "  length=" + length + "  width=" + width
				+ "]";
	}

}
