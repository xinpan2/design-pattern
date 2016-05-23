package com.xinpaninjava.prototype;

import java.util.ArrayList;

/**
 * ���¡��
 * 
 *���������Ҳ���һ�����ö���arraylist
 * 
 *�ڿ�¡������ʵ�ְ����ݸ��ƹ���
 */
public class DeepClone implements Cloneable {
	private String id;
	private ArrayList<String> contenList = new ArrayList<String>();
	private int quantity;

	@Override
	protected DeepClone clone() throws CloneNotSupportedException {

		DeepClone clonedObject = (DeepClone) super.clone();
		// �½�һ�����ö���
		ArrayList<String> newList = new ArrayList<String>();

		// �����ݸ��ƹ���
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
