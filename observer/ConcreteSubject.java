package com.xinpaninjava.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * �����Ŀ����1
 */
public class ConcreteSubject implements Subject {
	// ά����һ���۲�������
	private List<Observer> observers = new ArrayList<Observer>();
	// �����ӵ����ԣ��������ж����state���Զ�Ҫһ��
	private int state;

	/**
	 * ֪ͨ���еĶ�����,��������ֵ�����۲��ߣ�������Ҳͬ��
	 */
	@Override
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	/**
	 * �����۲���
	 */
	@Override
	public void registObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * �Ƴ�ָ���۲���
	 */
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public int getState() {
		return state;
	}

	/**
	 * �޸�state���Եķ������޸���֮��֪ͨ���й۲���
	 * 
	 * �����޸ĺ��ֵ�������ж�����
	 */
	public void setState(int state) {
		this.state = state;
		this.notifyAllObservers();
	}

}
