package com.xinpaninjava.composite;

/**
 * 组合模式测试类：通过直接创建目录文件的实例并对其进行杀毒
 */
public class Client {

	public static void main(String[] args) {
		// 总目录
		DirectoryFile directoryFile = new DirectoryFile("我的收藏");
		// 第一层级文件
		TextFile textFile = new TextFile("backup.txt");

		VedioFile vedioFile = new VedioFile("组合模式.mp4");

		ImageFile imageFile = new ImageFile("自拍.jpg");

		directoryFile.add(textFile);
		directoryFile.add(vedioFile);
		directoryFile.add(imageFile);

		DirectoryFile directoryFile2 = new DirectoryFile("目录2");
		// 第二层及文件
		TextFile textFile2 = new TextFile("密码.txt");

		VedioFile vedioFile2 = new VedioFile("设计模式.mp4");

		ImageFile imageFile2 = new ImageFile("类图.jpg");

		directoryFile2.add(imageFile2);
		directoryFile2.add(textFile2);
		directoryFile2.add(vedioFile2);

		directoryFile.add(directoryFile2);

		directoryFile.antivirus();
	}
}
