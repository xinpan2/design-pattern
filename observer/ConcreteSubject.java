package com.xinpaninjava.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的目标类1
 */
public class ConcreteSubject implements Subject {
	// 维护着一个观察者容器
	private List<Observer> observers = new ArrayList<Observer>();
	// 被监视的属性，假设所有对象的state属性都要一致
	private int state;

	/**
	 * 通知所有的订阅者,并把最新值传给观察者，让它们也同步
	 */
	@Override
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	/**
	 * 新增观察者
	 */
	@Override
	public void registObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 移除指定观察者
	 */
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public int getState() {
		return state;
	}

	/**
	 * 修改state属性的方法，修改完之后，通知所有观察者
	 * 
	 * 并把修改后的值告诉所有订阅者
	 */
	public void setState(int state) {
		this.state = state;
		this.notifyAllObservers();
	}

}
