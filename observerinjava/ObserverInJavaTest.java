package com.xinpaninjava.observerinjava;

/**
 * 观察者模式测试类
 */
public class ObserverInJavaTest {

	public static void main(String[] args) {
		// 创建目标对象
		ConcreteSubject subject = new ConcreteSubject();
		// 创建观察者对象
		ConcreteObserver observerA = new ConcreteObserver();
		ConcreteObserver observerB = new ConcreteObserver();
		ConcreteObserver observerC = new ConcreteObserver();
		// 注册观察者
		subject.addObserver(observerA);
		subject.addObserver(observerB);
		subject.addObserver(observerC);

		// 修改被监测属性的值
		subject.setState(1121);
	}

}
