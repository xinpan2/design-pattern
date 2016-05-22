package com.xinpaninjava.implementcomputor;

import java.util.Scanner;

public class SimpleComputor2 {

	public static void main(String[] args) {
		// 1、提示用户输入第一个数
		System.out.println("this is a simple computor~");
		System.out
				.println("please input the first number that you need to calculate");
		Scanner scanner = new Scanner(System.in);
		String firstNum = scanner.nextLine();

		// 2、提示用户输入操作符
		System.out.println("please input the operation");
		String oper = scanner.nextLine();

		// 3、提示用户输入第二个数
		System.out
				.println("please input the second number that you need to calculate");
		String secondNum = scanner.nextLine();

		// 4、输出操作结果
		double num1 = Double.parseDouble(firstNum);
		double num2 = Double.parseDouble(secondNum);
		double result = 0;

		Operation operation = OperationFactory.getOperation(oper);
		operation.setNum1(num1);
		operation.setNum2(num2);
		result = operation.getResult();

		System.out.println(firstNum + " " + oper + " " + secondNum + " = "
				+ result);
	}
}
