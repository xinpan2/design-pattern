package com.xinpaninjava.composite;

/**
 * 视频文件：叶子节点文件
 */
public class VedioFile implements File {
	private String name;

	public VedioFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void antivirus() {
		System.out.println("正在对 ： " + this.name + "  进行杀毒!");
	}

}
