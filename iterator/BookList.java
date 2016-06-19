package com.xinpaninjava.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的聚合类：用来作图书的容器
 * 
 * 参考JDk中ArrayList,LinkedList,都是使用内部类来实现迭代器
 */
public class BookList implements Aggresive {
	// 存储图书的容器
	private List<Book> books = new ArrayList<Book>();
	// 当前索引的脚标
	private int currentIndex;

	/**
	 * 聚合类的方法，实现增加图书
	 */
	@Override
	public boolean add(Book book) {
		return this.books.add(book);
	}

	/**
	 * 聚合类的方法，实现删除图书
	 */
	@Override
	public boolean remove(Book book) {
		return this.books.remove(book);
	}

	/**
	 * 内部类实现迭代器，这样方便操作外部的数据
	 */
	private class myIterator implements Iterator {
		/**
		 * 展示所有书籍
		 */
		@Override
		public void displayAllBooks() {
			for (Book book : books) {
				displayABook(book);
			}
		}

		/**
		 * 展示一本图书的信息
		 */
		@Override
		public void displayABook(Book book) {
			if (book != null) {
				System.out.println("图书名字：" + book.getName() + ",ISBN:"
						+ book.getISBN() + ",价格：" + book.getPrice());
			} else {
				throw new RuntimeException("the book is null !!!");
			}
		}

		/**
		 * 得到指定位置的图书
		 */
		@Override
		public Book getBook(int index) {

			return books.get(index);
		}

		/**
		 * 得到当前的图书
		 */
		@Override
		public Book getCurrentBook() {

			return books.get(currentIndex);
		}

		/**
		 * 先判断是否为最后一个元素，如果不是就返回，是就抛异常
		 */
		@Override
		public Book getNextBook() {
			if (hasNext()) {
				return books.get(currentIndex + 1);
			} else {
				throw new RuntimeException(
						"the current book is the last one !!!");
			}
		}

		/**
		 * 判断是否为最后一个元素:因为当前脚标从0开始，所以就算当前脚标等于集合长度也算越界
		 */
		@Override
		public boolean hasNext() {
			if (currentIndex < books.size()) {
				return true;
			} else {
				return false;
			}
		}
	}

}
