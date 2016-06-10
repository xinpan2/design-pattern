package com.xinpaninjava.observer;

/**
 * ����Ĺ۲���ʵ����
 * 
 */
public class ConcreteObserver implements Observer {
	// ÿ���۲�����Ŀ��ӵ����ͬ�����ԣ���Ϊ����Ҫ����һ��
	private int state;

	/**
	 * ͬ��Ŀ�����޸ĵ�����ֵ
	 */
	@Override
	public void update(Subject subject) {
		ConcreteSubject concreteSubject = (ConcreteSubject) subject;
		int newState = concreteSubject.getState();
		System.out.println("ͬ���ɹ����޸�ǰֵΪ:" + this.state + "����ֵΪ��" + newState);
		this.state = newState;
	}
}
