package com.xinpaninjava.observer;

/**
 * 所有观察者类的抽象接口
 */
public interface Observer {
	/**
	 * 观察者被监听的属性修改时，就是触发通知所有观察者方法
	 * 
	 * 并把最新的值传给观察者让它们同步
	 */
	public void update(Subject subject);
}
