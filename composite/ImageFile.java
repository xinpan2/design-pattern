package com.xinpaninjava.composite;

/**
 * ͼ���ļ���Ҷ�ӽڵ��ļ�
 */
public class ImageFile implements File {
	private String name;

	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void antivirus() {
		System.out.println("���ڶ� �� " + this.name + "  ����ɱ��!");
	}

}
