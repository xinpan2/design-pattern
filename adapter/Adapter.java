package com.xinpaninjava.adapter;

/**
 * 适配器：比如例子中的转换器，把两针插口和三针插座连接起来，在适配器类实现转换功能
 * 
 * 让它们连接起来的前提是，这个适配器需要实现目标接口
 * 
 * 然后通过组合/继承的方式实现被适配类
 * 
 */
public class Adapter implements Target {
	// 被转换的两针插口
	private Adaptee adaptee;

	/**
	 * 使用插座类：在这里通过转换器把两针插口插到了三针插座上
	 * 
	 * 此时就可以启动风扇了
	 */
	@Override
	public void useSocket() {
		System.out.println("使用三针插座~~!");
		this.adaptee.run();
	}

	/**
	 * 通过构造函数把被适配的类传进来
	 * 
	 * @param adaptee
	 *            两针插口
	 */
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

}
