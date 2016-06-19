package com.xinpaninjava.memento;

/**
 * Դ������: ������Ա������Ϊ����,���ڼ�¼Ա������Ϣ
 */
public class Employee {
	private String name;
	private int age;
	private double salary;

	/**
	 * ͨ�����캯������Ӧ�����Դ�����
	 * 
	 * @param name
	 *            Ա������
	 * @param age
	 *            Ա������
	 * @param salary
	 *            Ա��нˮ
	 */
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	/**
	 * ���б��ݲ������ѵ�ǰ�����״̬��������¼��
	 */
	public EmployeeMemento backup() {
		return new EmployeeMemento(this);
	}

	/**
	 * ���ݻָ��������ѱ���¼�б����״̬��ֵ����ǰ����
	 */
	public void recovery(EmployeeMemento memento) {
		this.age = memento.getAge();
		this.name = memento.getName();
		this.salary = memento.getSalary();
	}

	/**
	 * toString������������������
	 */
	@Override
	public String toString() {
		return " [age=" + age + ", name=" + name + ", salary=" + salary + "]";
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
