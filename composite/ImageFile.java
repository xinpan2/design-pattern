package com.xinpaninjava.composite;

/**
 * 图像文件：叶子节点文件
 */
public class ImageFile implements File {
	private String name;

	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void antivirus() {
		System.out.println("正在对 ： " + this.name + "  进行杀毒!");
	}

}
