package com.xinpaninjava.implementcomputor;

public class Division extends Operation {

	public double getResult() {
		if (getNum2() == 0) {
			throw new RuntimeException("can not divide by zero !");
		}
		return getNum1() / getNum2();
	}

}
