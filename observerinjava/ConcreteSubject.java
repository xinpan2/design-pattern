package com.xinpaninjava.observerinjava;

import java.util.Observable;

/**
 * 观察者模式目标类：继承observable类
 */
public class ConcreteSubject extends Observable {
	// 被监测的属性
	private int state;

	public int getState() {
		return state;
	}

	/**
	 * 修改被监测的属性
	 * 
	 * 不过要通知到观察者，首先要让对象的hasChanged()返回true，所以在这里要自己设置成true
	 */
	public void setState(int state) {
		this.state = state;
		this.setChanged();
		this.notifyObservers(this);
	}

}
