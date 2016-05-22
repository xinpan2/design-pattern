package com.xinpaninjava.implementcomputor;

public class OperationFactory {
	public static Operation getOperation(String oper) {
		if ("+".equals(oper)) {
			return new Add();
		} else if ("-".equals(oper)) {
			return new Subtraction();
		} else if ("*".equals(oper)) {
			return new Multiplication();
		} else if ("/".equals(oper)) {
			return new Division();
		} else {
			throw new RuntimeException("no such operation !");
		}
	}
}
