package com.xinpaninjava.chainofresponsibility;

/**
 * 责任链模式测试类，用于模拟员工的请假处理
 */
public class ChainOfResponsibilityTest {

	public static void main(String[] args) {

		Leader directorA = new Director("张三");

		Leader managerA = new Manager("李四");

		Leader generalManagerA = new GeneralManager("王五");

		// 设置责任链关系
		directorA.setNextLeader(managerA);
		managerA.setNextLeader(generalManagerA);

		// 假条
		LeaveRequest leaveRequest1 = new LeaveRequest("小明", 2, "出差");

		// 3天
		LeaveRequest leaveRequest2 = new LeaveRequest("小明", 3, "出差");

		// 16天
		LeaveRequest leaveRequest3 = new LeaveRequest("小明", 16, "出差");

		directorA.handleRequest(leaveRequest1);
		directorA.handleRequest(leaveRequest2);
		directorA.handleRequest(leaveRequest3);
		
	}
}
