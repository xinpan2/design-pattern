package com.xinpaninjava.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录文件：非叶子节点文件
 * 
 * 目录文件与普通的文件不一样，目录文件还有对该目录文件的引用
 */
public class DirectoryFile implements Floder {
	// 文件夹名字
	private String name;
	private List<AbstractFile> files;

	/**
	 * 目录杀毒的具体实现
	 */
	@Override
	public void antivirus() {
		System.out.println("正在对 ： " + this.name + " 目录进行杀毒!");
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
	 * 对该目录添加文件
	 */
	public boolean add(AbstractFile file) {
		return files.add(file);
	}

	/**
	 * 删除目录中的指定文件
	 */
	public boolean remove(AbstractFile file) {
		return files.remove(file);

	}
}
