package com.xinpaninjava.observerinjava;

import java.util.Observable;

/**
 * �۲���ģʽĿ���ࣺ�̳�observable��
 */
public class ConcreteSubject extends Observable {
	// ����������
	private int state;

	public int getState() {
		return state;
	}

	/**
	 * �޸ı���������
	 * 
	 * ����Ҫ֪ͨ���۲��ߣ�����Ҫ�ö����hasChanged()����true������������Ҫ�Լ����ó�true
	 */
	public void setState(int state) {
		this.state = state;
		this.setChanged();
		this.notifyObservers(this);
	}

}
