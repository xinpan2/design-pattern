package com.xinpaninjava.prototypebuilder;

/**
 * �컨��--��Ʒ�������֮һ
 * 
 *���������ֶζ��ǻ����������ͺ��ַ���
 */
public class PrototypeCeiling implements Cloneable {
	private String color;
	private double length;
	private double width;

	@Override
	protected PrototypeCeiling clone() throws CloneNotSupportedException {

		return (PrototypeCeiling) super.clone();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

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

	@Override
	public String toString() {
		return " [color=" + color + "  length=" + length + "  width=" + width
				+ "]";
	}
}
