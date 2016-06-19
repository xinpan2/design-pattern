package com.xinpaninjava.iterator;

/**
 * 聚合类：用来存储对象，并且定义除了遍历容器以外的操作方法
 */
public interface Aggresive {
	/**
	 * 增加图书
	 */
	public boolean add(Book book);

	/**
	 * 删除图书
	 */
	public boolean remove(Book book);

}
