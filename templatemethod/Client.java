package com.xinpaninjava.templatemethod;

/**
 * 模板方法模式的测试类
 * 
 * 可以使用匿名内部类的形式来模拟某一个具体的客户
 */
public class Client {

	public static void main(String[] args) {
		// 客户1：取款2000
		ProcessHandle client1 = new ProcessHandle() {

			@Override
			public void transact() {
				System.out.println("我要取款2000元");
			}

		};
		// 调用流程
		client1.process();

		System.out.println("======================================");

		// 客户2：存款1000

		ProcessHandle client2 = new ProcessHandle() {

			@Override
			public void transact() {
				System.out.println("我要存款1000元");
			}
		};
		// 调用流程
		client2.process();
	}

}
