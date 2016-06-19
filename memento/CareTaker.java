package com.xinpaninjava.memento;

/**
 * 负责人对象：用于存储备忘录类,在这里使用单点备份
 */
public class CareTaker {
	private EmployeeMemento memento;

	public EmployeeMemento getMemento() {
		return memento;
	}

	public void setMemento(EmployeeMemento memento) {
		this.memento = memento;
	}

}
