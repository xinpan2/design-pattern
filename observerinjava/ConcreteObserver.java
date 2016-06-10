package com.xinpaninjava.observerinjava;

import java.util.Observable;
import java.util.Observer;

/**
 * �۲���ģʽ �۲�����:ʵ�� observer�ӿ�
 * 
 */
public class ConcreteObserver implements Observer {
	// ��Ҫ��Ŀ�����ͬ��������
	private int state;

	/**
	 * �۲��߶����ڱ�֪֮ͨ��Ĭ��ִ�еķ���
	 * 
	 * �������ʵ�ְѴ������Ķ�������ͬ���ɵ�ǰ���������
	 * 
	 * @param Observable
	 *            o Ŀ�����
	 * @param Object
	 *            arg ��ʹ��notifyObservers()�������Ķ���
	 */
	@Override
	public void update(Observable o, Object arg) {
		ConcreteSubject subject = (ConcreteSubject) arg;
		int newState = subject.getState();
		System.out.println("ͬ���ɹ���ԭ����ֵΪ��" + this.state + "ͬ�����ֵΪ��" + newState);
		this.state = newState;

	}
}
