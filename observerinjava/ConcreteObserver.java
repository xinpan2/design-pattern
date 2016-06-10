package com.xinpaninjava.observerinjava;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式 观察者类:实现 observer接口
 * 
 */
public class ConcreteObserver implements Observer {
	// 需要与目标对象同步的属性
	private int state;

	/**
	 * 观察者对象在被通知之后默认执行的方法
	 * 
	 * 这个方法实现把传过来的对象属性同步成当前对象的属性
	 * 
	 * @param Observable
	 *            o 目标对象
	 * @param Object
	 *            arg 在使用notifyObservers()传过来的对象
	 */
	@Override
	public void update(Observable o, Object arg) {
		ConcreteSubject subject = (ConcreteSubject) arg;
		int newState = subject.getState();
		System.out.println("同步成功，原来的值为：" + this.state + "同步后的值为：" + newState);
		this.state = newState;

	}
}
