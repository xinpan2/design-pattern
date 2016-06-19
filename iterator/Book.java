package com.xinpaninjava.iterator;

/**
 * 需要被存储的对象
 */
public class Book {
	private String name;
	private String ISBN;
	private double price;

	public Book(String name, String iSBN, double price) {
		super();
		this.name = name;
		ISBN = iSBN;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
