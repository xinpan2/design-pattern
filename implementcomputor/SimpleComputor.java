package com.xinpaninjava.implementcomputor;

import java.util.Scanner;

/**
 * 实现简单的计算器--原始版
 */
public class SimpleComputor {

	public static void main(String[] args) {
		// 1、提示用户输入第一个数
		System.out.println("this is a simple computor~");
		System.out
				.println("please input the first number that you need to calculate");
		Scanner scanner = new Scanner(System.in);
		String firstNum = scanner.nextLine();

		// 2、提示用户输入操作符
		System.out.println("please input the operation");
		String operation = scanner.nextLine();

		// 3、提示用户输入第二个数
		System.out
				.println("please input the second number that you need to calculate");
		String secondNum = scanner.nextLine();

		double num1 = Double.parseDouble(firstNum);
		double num2 = Double.parseDouble(secondNum);
		double result = 0;
		// 判断属于哪种操作
		if ("+".equals(operation)) {
			result = num1 + num2;
		} else if ("-".equals(operation)) {
			result = num1 - num2;
		} else if ("*".equals(operation)) {
			result = num1 * num2;
		} else if ("/".equals(operation)) {
			if (num2 == 0) {
				throw new RuntimeException("can't divided by the zero !!!");
			}
			result = num1 / num2;
		} else {
			throw new RuntimeException("there have no such operation  ~.~|||  ");
		}

		// 4、输出操作结果
		System.out.println(firstNum + " " + operation + " " + secondNum + " = "
				+ result);
	}
}
