package com.xinpaninjava.prototype;

import java.util.ArrayList;

/**
 * 深克隆类
 * 
 *在这个类中也设计一个引用对象，arraylist
 * 
 *在克隆方法中实现把数据复制过来
 */
public class DeepClone implements Cloneable {
	private String id;
	private ArrayList<String> contenList = new ArrayList<String>();
	private int quantity;

	@Override
	protected DeepClone clone() throws CloneNotSupportedException {

		DeepClone clonedObject = (DeepClone) super.clone();
		// 新建一个引用对象
		ArrayList<String> newList = new ArrayList<String>();

		// 把数据复制过来
		for (String content : clonedObject.getContenList()) {
			newList.add(content);
		}
		clonedObject.setContenList(newList);

		return clonedObject;

	}

	// ---------getter && setter ------------------
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<String> getContenList() {
		return contenList;
	}

	public void setContenList(ArrayList<String> contenList) {
		this.contenList = contenList;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
