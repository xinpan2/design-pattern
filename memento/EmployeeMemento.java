package com.xinpaninjava.memento;

/**
 * 备忘录类:用于记录源发器类对象（即员工对象）的状态
 * 
 * 通过构造函数把要备份的对象传进来
 */
public class EmployeeMemento {
	// 从源发器类中复制过来的属性
	private String name;
	private int age;
	private double salary;

	/**
	 * 在源发器类调用备份操作时，把源发器类对象通过构造函数传过来
	 * 
	 * 并给当前对象的属性赋值
	 * 
	 * @param employee
	 *            源发器类对象
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
