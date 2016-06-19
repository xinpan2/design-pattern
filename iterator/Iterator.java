package com.xinpaninjava.iterator;

/**
 * 迭代器接口，用来定义实现该接口的公共行为
 */
public interface Iterator {
	/**
	 * 得到指定位置的书
	 */
	public Book getBook(int index);

	/**
	 * 判断是否有下一本图书
	 */
	public boolean hasNext();

	/**
	 * 得到当前遍历的图书
	 */
	public Book getCurrentBook();

	/**
	 * 得到下一本图书
	 */
	public Book getNextBook();

	/**
	 * 展示所有图示
	 */
	public void displayAllBooks();

	/**
	 * 展示当前图书
	 */
	public void displayABook(Book book);
}
