package com.xinpaninjava.composite;

/**
 * ��Ƶ�ļ���Ҷ�ӽڵ��ļ�
 */
public class VedioFile implements File {
	private String name;

	public VedioFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void antivirus() {
		System.out.println("���ڶ� �� " + this.name + "  ����ɱ��!");
	}

}
