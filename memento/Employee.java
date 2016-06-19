package com.xinpaninjava.memento;

/**
 * 源发器类: 这里用员工类作为例子,用于记录员工的信息
 */
public class Employee {
	private String name;
	private int age;
	private double salary;

	/**
	 * 通过构造函数把相应的属性传进来
	 * 
	 * @param name
	 *            员工姓名
	 * @param age
	 *            员工年龄
	 * @param salary
	 *            员工薪水
	 */
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	/**
	 * 进行备份操作，把当前对象的状态传给备忘录类
	 */
	public EmployeeMemento backup() {
		return new EmployeeMemento(this);
	}

	/**
	 * 数据恢复操作，把备忘录中保存的状态赋值给当前对象
	 */
	public void recovery(EmployeeMemento memento) {
		this.age = memento.getAge();
		this.name = memento.getName();
		this.salary = memento.getSalary();
	}

	/**
	 * toString方法，方便测试类调用
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
