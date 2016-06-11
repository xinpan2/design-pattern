package com.xinpaninjava.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ��Ԫ����������ά������Ԫ�������
 */
public class ChessFactory {
	// ��Ԫ���������ü�ֵ��ʵ��
	private static Map<String, ConcreteChess> chesses = new HashMap<String, ConcreteChess>();

	/**
	 * ��������:ͨ������������ɫ�ж�������û�ж�Ӧ�Ķ���
	 * 
	 * - û�оʹ���,���ӵ�������
	 * 
	 * - �о�ȡ���ٷ���
	 */
	public static ConcreteChess getChess(String color) {
		ConcreteChess chess = chesses.get(color);
		if (chess == null) {
			chess = new ConcreteChess(color);
			chesses.put(color, chess);
			System.out.println("����������͵������У�����Ϊ��" + color);
			return chess;
		} else {
			return chess;
		}
	}
}
