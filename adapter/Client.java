package com.xinpaninjava.adapter;

/**
 * 适配器测试类：通过调用转换器来使风扇运行起来
 */
public class Client {

	public static void main(String[] args) {
		// 创建风扇的实例
		Adaptee fan = new Adaptee();
		// 创建适配器的实例并使用三针插座
		Target adapter = new Adapter(fan);
		adapter.useSocket();
	}

}
