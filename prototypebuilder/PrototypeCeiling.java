package com.xinpaninjava.prototypebuilder;

/**
 * 天花板--产品类的属性之一
 * 
 *在这个类的字段都是基本数据类型和字符串
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
