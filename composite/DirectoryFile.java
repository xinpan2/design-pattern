package com.xinpaninjava.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ¼�ļ�����Ҷ�ӽڵ��ļ�
 * 
 * Ŀ¼�ļ�����ͨ���ļ���һ����Ŀ¼�ļ����жԸ�Ŀ¼�ļ�������
 */
public class DirectoryFile implements Floder {
	// �ļ�������
	private String name;
	private List<AbstractFile> files;

	/**
	 * Ŀ¼ɱ���ľ���ʵ��
	 */
	@Override
	public void antivirus() {
		System.out.println("���ڶ� �� " + this.name + " Ŀ¼����ɱ��!");
		for (AbstractFile file : files) {
			file.antivirus();
		}
	}

	public DirectoryFile(String name) {
		super();
		this.name = name;
		this.files = new ArrayList<AbstractFile>();
	}

	/**
	 * �Ը�Ŀ¼����ļ�
	 */
	public boolean add(AbstractFile file) {
		return files.add(file);
	}

	/**
	 * ɾ��Ŀ¼�е�ָ���ļ�
	 */
	public boolean remove(AbstractFile file) {
		return files.remove(file);

	}
}
