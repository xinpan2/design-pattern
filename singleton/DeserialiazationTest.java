package com.xinpaninjava.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ����û��ʵ��readResolved�����ĵ���
 * 
 * ���������л������Ķ����Ƿ��֮ǰ�洢�Ķ���һ��
 */
public class DeserialiazationTest {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		// �õ�����ʵ��
		VolatileDoubleCheckedLocking singleton = VolatileDoubleCheckedLocking
				.getInstance();

		// �������������д�뵽�ļ���
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("tempFile"));
		objectOutputStream.writeObject(singleton);

		File file = new File("newFile");

		// ����������������ȡ���ļ���
		ObjectInputStream inputStream = new ObjectInputStream(
				new FileInputStream("tempFile"));
		VolatileDoubleCheckedLocking singleton2 = (VolatileDoubleCheckedLocking) inputStream
				.readObject();

		// �ж�ǰ�����������Ƿ�һ��
		System.out.println(singleton == singleton2);

		// ����
		inputStream.close();
		objectOutputStream.close();
	}
}
