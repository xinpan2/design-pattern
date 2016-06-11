package com.xinpaninjava.flyweight;

/**
 * 享元模式测试类（也可以成为客户端），通过判断两个相同原色的对象是否一致
 */
public class FlyWeightTest {

	public static void main(String[] args) {
		Chess bChess1 = ChessFactory.getChess("黑色");
		bChess1.display(new Coordinate(1, 2));
		Chess bChess2 = ChessFactory.getChess("黑色");
		bChess2.display(new Coordinate(2, 3));

		// 判断两个相同原色的对象是否一致
		System.out.println(bChess1 == bChess2 ? "true" : "false");

		Chess wChess1 = ChessFactory.getChess("白色");
		wChess1.display(new Coordinate(4, 3));
		Chess wChess2 = ChessFactory.getChess("白色");
		wChess2.display(new Coordinate(5, 3));

		// 判断两个相同原色的对象是否一致
		System.out.println(wChess1 == wChess2 ? "true" : "false");
	}

}
