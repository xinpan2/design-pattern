package com.xinpaninjava.iterator;

/**
 * �������ӿڣ���������ʵ�ָýӿڵĹ�����Ϊ
 */
public interface Iterator {
	/**
	 * �õ�ָ��λ�õ���
	 */
	public Book getBook(int index);

	/**
	 * �ж��Ƿ�����һ��ͼ��
	 */
	public boolean hasNext();

	/**
	 * �õ���ǰ������ͼ��
	 */
	public Book getCurrentBook();

	/**
	 * �õ���һ��ͼ��
	 */
	public Book getNextBook();

	/**
	 * չʾ����ͼʾ
	 */
	public void displayAllBooks();

	/**
	 * չʾ��ǰͼ��
	 */
	public void displayABook(Book book);
}
