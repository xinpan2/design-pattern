package com.xinpaninjava.observer;

/**
 * 观察者模式测试类，通过修改目标对象的属性值来测试是否监听成功
 */
public class ObserverPatternTest {

	public static void main(String[] args) {
		// 创建目标对象
		ConcreteSubject subject = new ConcreteSubject();
		// 创建观察者对象
		ConcreteObserver observerA = new ConcreteObserver();
		ConcreteObserver observerB = new ConcreteObserver();
		ConcreteObserver observerC = new ConcreteObserver();

		// 先注册观察者对象
		subject.registObserver(observerA);
		subject.registObserver(observerB);
		subject.registObserver(observerC);

		// 修改目标对象属性
		subject.setState(123);
	}

}
