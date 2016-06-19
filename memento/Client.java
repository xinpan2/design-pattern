package com.xinpaninjava.memento;

/**
 * ����¼ģʽ������
 * 
 * 1�����ȴ���һ�����󣬸�ֵ������
 * 
 * 2�����е�һ������󱸷ݶ���״̬
 * 
 * 3����ԭ�����������ֵ���޸Ĳ�������һ���������״̬
 * 
 * 4���ָ�����״̬
 * 
 */
public class Client {

	public static void main(String[] args) {
		// 1�����ȴ���һ�����󣬸�ֵ������
		Employee xinpan = new Employee("xinpan", 18, 100);
		// 2�����е�һ������󱸷ݶ���״̬
		EmployeeMemento memento = xinpan.backup();
		// 2.1�õ����ݶ���ʱ�����������ڸ������࣬���ڹ����ݶ���
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(memento);

		System.out.println("��1�����:" + xinpan.toString());

		// 3����ԭ�����������ֵ���޸Ĳ�������һ���������״̬
		xinpan.setAge(20);
		xinpan.setName("abc");
		xinpan.setSalary(10);

		System.out.println("��2�����:" + xinpan.toString());

		// 4���ָ�����״̬

		xinpan.recovery(memento);
		System.out.println("��3�����:" + xinpan.toString());

	}

}
