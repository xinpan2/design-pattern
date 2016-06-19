package com.xinpaninjava.memento;

/**
 * 备忘录模式测试类
 * 
 * 1、首先创建一个对象，赋值好属性
 * 
 * 2、进行第一次输出后备份对象状态
 * 
 * 3、对原对象进行属性值的修改操作后再一次输出对象状态
 * 
 * 4、恢复对象状态
 * 
 */
public class Client {

	public static void main(String[] args) {
		// 1、首先创建一个对象，赋值好属性
		Employee xinpan = new Employee("xinpan", 18, 100);
		// 2、进行第一次输出后备份对象状态
		EmployeeMemento memento = xinpan.backup();
		// 2.1得到备份对象时，把它保存在负责人类，用于管理备份对象
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(memento);

		System.out.println("第1次输出:" + xinpan.toString());

		// 3、对原对象进行属性值的修改操作后再一次输出对象状态
		xinpan.setAge(20);
		xinpan.setName("abc");
		xinpan.setSalary(10);

		System.out.println("第2次输出:" + xinpan.toString());

		// 4、恢复对象状态

		xinpan.recovery(memento);
		System.out.println("第3次输出:" + xinpan.toString());

	}

}
