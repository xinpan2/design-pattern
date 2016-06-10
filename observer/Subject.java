package com.xinpaninjava.observer;

/**
 * ����Ŀ��ĳ���ӿڣ��������幫����Ϊ
 */
public interface Subject {

	/**
	 * ֪ͨ���еĶ�����
	 */
	public void notifyAllObservers();

	/**
	 * �����۲���
	 */
	public void registObserver(Observer observer);

	/**
	 * �Ƴ�ָ���Ĺ۲���
	 */
	public void removeObserver(Observer observer);
}
