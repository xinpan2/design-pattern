package com.xinpaninjava.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ľۺ��ࣺ������ͼ�������
 * 
 * �ο�JDk��ArrayList,LinkedList,����ʹ���ڲ�����ʵ�ֵ�����
 */
public class BookList implements Aggresive {
	// �洢ͼ�������
	private List<Book> books = new ArrayList<Book>();
	// ��ǰ�����Ľű�
	private int currentIndex;

	/**
	 * �ۺ���ķ�����ʵ������ͼ��
	 */
	@Override
	public boolean add(Book book) {
		return this.books.add(book);
	}

	/**
	 * �ۺ���ķ�����ʵ��ɾ��ͼ��
	 */
	@Override
	public boolean remove(Book book) {
		return this.books.remove(book);
	}

	/**
	 * �ڲ���ʵ�ֵ�������������������ⲿ������
	 */
	private class myIterator implements Iterator {
		/**
		 * չʾ�����鼮
		 */
		@Override
		public void displayAllBooks() {
			for (Book book : books) {
				displayABook(book);
			}
		}

		/**
		 * չʾһ��ͼ�����Ϣ
		 */
		@Override
		public void displayABook(Book book) {
			if (book != null) {
				System.out.println("ͼ�����֣�" + book.getName() + ",ISBN:"
						+ book.getISBN() + ",�۸�" + book.getPrice());
			} else {
				throw new RuntimeException("the book is null !!!");
			}
		}

		/**
		 * �õ�ָ��λ�õ�ͼ��
		 */
		@Override
		public Book getBook(int index) {

			return books.get(index);
		}

		/**
		 * �õ���ǰ��ͼ��
		 */
		@Override
		public Book getCurrentBook() {

			return books.get(currentIndex);
		}

		/**
		 * ���ж��Ƿ�Ϊ���һ��Ԫ�أ�������Ǿͷ��أ��Ǿ����쳣
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
		 * �ж��Ƿ�Ϊ���һ��Ԫ��:��Ϊ��ǰ�ű��0��ʼ�����Ծ��㵱ǰ�ű���ڼ��ϳ���Ҳ��Խ��
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
