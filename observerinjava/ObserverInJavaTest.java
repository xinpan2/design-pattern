package com.xinpaninjava.observerinjava;

/**
 * �۲���ģʽ������
 */
public class ObserverInJavaTest {

	public static void main(String[] args) {
		// ����Ŀ�����
		ConcreteSubject subject = new ConcreteSubject();
		// �����۲��߶���
		ConcreteObserver observerA = new ConcreteObserver();
		ConcreteObserver observerB = new ConcreteObserver();
		ConcreteObserver observerC = new ConcreteObserver();
		// ע��۲���
		subject.addObserver(observerA);
		subject.addObserver(observerB);
		subject.addObserver(observerC);

		// �޸ı�������Ե�ֵ
		subject.setState(1121);
	}

}
