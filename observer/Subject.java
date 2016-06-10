package com.xinpaninjava.observer;

/**
 * 所有目标的抽象接口，用来定义公共行为
 */
public interface Subject {

	/**
	 * 通知所有的订阅者
	 */
	public void notifyAllObservers();

	/**
	 * 新增观察者
	 */
	public void registObserver(Observer observer);

	/**
	 * 移除指定的观察者
	 */
	public void removeObserver(Observer observer);
}
