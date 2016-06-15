package com.xinpaninjava.composite;

/**
 * 文本文件：叶子节点文件
 */
public class TextFile implements File {
	// 文件名
	private String name;

	public TextFile(String name) {
		super();
		this.name = name;
	}

	/**
	 * 对文本文件进行杀毒
	 */
	@Override
	public void antivirus() {
		System.out.println("正在对 ： " + this.name + "  进行杀毒!");
	}

}
