package com.xinpaninjava.implementcomputor;

import java.util.Scanner;

public class SimpleComputor2 {

	public static void main(String[] args) {
		// 1����ʾ�û������һ����
		System.out.println("this is a simple computor~");
		System.out
				.println("please input the first number that you need to calculate");
		Scanner scanner = new Scanner(System.in);
		String firstNum = scanner.nextLine();

		// 2����ʾ�û����������
		System.out.println("please input the operation");
		String oper = scanner.nextLine();

		// 3����ʾ�û�����ڶ�����
		System.out
				.println("please input the second number that you need to calculate");
		String secondNum = scanner.nextLine();

		// 4������������
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
