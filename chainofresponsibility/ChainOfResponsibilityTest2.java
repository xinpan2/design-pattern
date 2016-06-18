package com.xinpaninjava.chainofresponsibility;

/**
 * 责任链模式测试类，用于测试员工的处理 10-20天假条
 */
public class ChainOfResponsibilityTest2 {

	public static void main(String[] args) {

		Leader directorA = new Director("张三");

		Leader managerA = new Manager("李四");

		Leader viceManagerA = new GeneralManager("刘六");

		Leader generalManagerA = new GeneralManager("王五");

		// 设置责任链关系
		directorA.setNextLeader(managerA);

		managerA.setNextLeader(viceManagerA);

		viceManagerA.setNextLeader(generalManagerA);

		// 假条

		// 16天
		LeaveRequest leaveRequest3 = new LeaveRequest("小明", 16, "出差");

		directorA.handleRequest(leaveRequest3);

	}
}
