package com.xinpaninjava.memento;

/**
 * ����¼��:���ڼ�¼Դ��������󣨼�Ա�����󣩵�״̬
 * 
 * ͨ�����캯����Ҫ���ݵĶ��󴫽���
 */
public class EmployeeMemento {
	// ��Դ�������и��ƹ���������
	private String name;
	private int age;
	private double salary;

	/**
	 * ��Դ��������ñ��ݲ���ʱ����Դ���������ͨ�����캯��������
	 * 
	 * ������ǰ��������Ը�ֵ
	 * 
	 * @param employee
	 *            Դ���������
	 */
	public EmployeeMemento(Employee employee) {
		super();
		this.name = employee.getName();
		this.age = employee.getAge();
		this.salary = employee.getSalary();
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
