package com.xinpaninjava.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂，里面维护着享元类的容器
 */
public class ChessFactory {
	// 享元容器，利用键值对实现
	private static Map<String, ConcreteChess> chesses = new HashMap<String, ConcreteChess>();

	/**
	 * 工厂方法:通过传过来的颜色判断容器有没有对应的对象
	 * 
	 * - 没有就创建,并加到容器中
	 * 
	 * - 有就取出再返回
	 */
	public static ConcreteChess getChess(String color) {
		ConcreteChess chess = chesses.get(color);
		if (chess == null) {
			chess = new ConcreteChess(color);
			chesses.put(color, chess);
			System.out.println("已添加新类型到容器中，类型为：" + color);
			return chess;
		} else {
			return chess;
		}
	}
}
