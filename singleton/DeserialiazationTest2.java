package com.xinpaninjava.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试实现了readResolved方法的单例
 * 
 * 看看反序列化产生的对象是否跟之前存储的对象一样
 */
public class DeserialiazationTest2 {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		// 得到单例实例
		VolatileDoubleCheckedLocking2 singleton = VolatileDoubleCheckedLocking2
				.getInstance();

		// 开启输出流，并写入到文件中
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("tempFile"));
		objectOutputStream.writeObject(singleton);

		File file = new File("newFile");

		// 开启输入流，并读取到文件中
		ObjectInputStream inputStream = new ObjectInputStream(
				new FileInputStream("tempFile"));
		VolatileDoubleCheckedLocking2 singleton2 = (VolatileDoubleCheckedLocking2) inputStream
				.readObject();

		// 判断前后两个对象是否一样
		System.out.println(singleton == singleton2);

		// 关流
		inputStream.close();
		objectOutputStream.close();
	}
}
