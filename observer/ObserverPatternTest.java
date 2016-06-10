package com.xinpaninjava.observer;

/**
 * �۲���ģʽ�����࣬ͨ���޸�Ŀ����������ֵ�������Ƿ�����ɹ�
 */
public class ObserverPatternTest {

	public static void main(String[] args) {
		// ����Ŀ�����
		ConcreteSubject subject = new ConcreteSubject();
		// �����۲��߶���
		ConcreteObserver observerA = new ConcreteObserver();
		ConcreteObserver observerB = new ConcreteObserver();
		ConcreteObserver observerC = new ConcreteObserver();

		// ��ע��۲��߶���
		subject.registObserver(observerA);
		subject.registObserver(observerB);
		subject.registObserver(observerC);

		// �޸�Ŀ���������
		subject.setState(123);
	}

}
