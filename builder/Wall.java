package com.xinpaninjava.builder;

/**
 * 墙壁--产品类的属性之一
 * 
 *在这个类的字段都是基本数据类型和字符串
 */
public class Wall {
	private double length;
	private double width;
	private double height;
	private String color;
	private int quantity;

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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return " [color=" + color + "  height=" + height + "  length=" + length
				+ "  quantity=" + quantity + "  width=" + width + "]";
	}
}
