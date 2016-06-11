package com.xinpaninjava.flyweight;

/**
 * ��Ԫģʽ�����ࣨҲ���Գ�Ϊ�ͻ��ˣ���ͨ���ж�������ͬԭɫ�Ķ����Ƿ�һ��
 */
public class FlyWeightTest {

	public static void main(String[] args) {
		Chess bChess1 = ChessFactory.getChess("��ɫ");
		bChess1.display(new Coordinate(1, 2));
		Chess bChess2 = ChessFactory.getChess("��ɫ");
		bChess2.display(new Coordinate(2, 3));

		// �ж�������ͬԭɫ�Ķ����Ƿ�һ��
		System.out.println(bChess1 == bChess2 ? "true" : "false");

		Chess wChess1 = ChessFactory.getChess("��ɫ");
		wChess1.display(new Coordinate(4, 3));
		Chess wChess2 = ChessFactory.getChess("��ɫ");
		wChess2.display(new Coordinate(5, 3));

		// �ж�������ͬԭɫ�Ķ����Ƿ�һ��
		System.out.println(wChess1 == wChess2 ? "true" : "false");
	}

}
