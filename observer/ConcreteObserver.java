package com.xinpaninjava.observer;

/**
 * 具体的观察者实现类
 * 
 */
public class ConcreteObserver implements Observer {
	// 每个观察者与目标拥有相同的属性，因为它们要保持一致
	private int state;

	/**
	 * 同步目标所修改的属性值
	 */
	@Override
	public void update(Subject subject) {
		ConcreteSubject concreteSubject = (ConcreteSubject) subject;
		int newState = concreteSubject.getState();
		System.out.println("同步成功，修改前值为:" + this.state + "最新值为：" + newState);
		this.state = newState;
	}
}
