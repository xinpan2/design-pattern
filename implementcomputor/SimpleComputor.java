package com.xinpaninjava.implementcomputor;

import java.util.Scanner;

/**
 * ʵ�ּ򵥵ļ�����--ԭʼ��
 */
public class SimpleComputor {

	public static void main(String[] args) {
		// 1����ʾ�û������һ����
		System.out.println("this is a simple computor~");
		System.out
				.println("please input the first number that you need to calculate");
		Scanner scanner = new Scanner(System.in);
		String firstNum = scanner.nextLine();

		// 2����ʾ�û����������
		System.out.println("please input the operation");
		String operation = scanner.nextLine();

		// 3����ʾ�û�����ڶ�����
		System.out
				.println("please input the second number that you need to calculate");
		String secondNum = scanner.nextLine();

		double num1 = Double.parseDouble(firstNum);
		double num2 = Double.parseDouble(secondNum);
		double result = 0;
		// �ж��������ֲ���
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

		// 4������������
		System.out.println(firstNum + " " + operation + " " + secondNum + " = "
				+ result);
	}
}
