package com.xinpaninjava.composite;

/**
 * ���ģʽ�����ࣺͨ��ֱ�Ӵ���Ŀ¼�ļ���ʵ�����������ɱ��
 */
public class Client {

	public static void main(String[] args) {
		// ��Ŀ¼
		DirectoryFile directoryFile = new DirectoryFile("�ҵ��ղ�");
		// ��һ�㼶�ļ�
		TextFile textFile = new TextFile("backup.txt");

		VedioFile vedioFile = new VedioFile("���ģʽ.mp4");

		ImageFile imageFile = new ImageFile("����.jpg");

		directoryFile.add(textFile);
		directoryFile.add(vedioFile);
		directoryFile.add(imageFile);

		DirectoryFile directoryFile2 = new DirectoryFile("Ŀ¼2");
		// �ڶ��㼰�ļ�
		TextFile textFile2 = new TextFile("����.txt");

		VedioFile vedioFile2 = new VedioFile("���ģʽ.mp4");

		ImageFile imageFile2 = new ImageFile("��ͼ.jpg");

		directoryFile2.add(imageFile2);
		directoryFile2.add(textFile2);
		directoryFile2.add(vedioFile2);

		directoryFile.add(directoryFile2);

		directoryFile.antivirus();
	}
}
