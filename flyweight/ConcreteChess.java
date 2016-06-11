package com.xinpaninjava.flyweight;

/**
 * 具体享元类
 */
public class ConcreteChess implements Chess {
	// 需要共享的属性：棋子的颜色
	private String color;

	/**
	 * 输出当前的颜色和位置
	 */
	@Override
	public void display(Coordinate coordinate) {
		System.out.println("颜色：" + this.color + "(" + coordinate.getX() + ","
				+ coordinate.getY() + ")");
	}

	/**
	 * 构造函数，通过把颜色传进来创建对象，这个函数由享元工厂调用
	 */
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

}
