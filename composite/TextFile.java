package com.xinpaninjava.composite;

/**
 * �ı��ļ���Ҷ�ӽڵ��ļ�
 */
public class TextFile implements File {
	// �ļ���
	private String name;

	public TextFile(String name) {
		super();
		this.name = name;
	}

	/**
	 * ���ı��ļ�����ɱ��
	 */
	@Override
	public void antivirus() {
		System.out.println("���ڶ� �� " + this.name + "  ����ɱ��!");
	}

}
