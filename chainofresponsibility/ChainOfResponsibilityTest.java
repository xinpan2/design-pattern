package com.xinpaninjava.chainofresponsibility;

/**
 * ������ģʽ�����࣬����ģ��Ա������ٴ���
 */
public class ChainOfResponsibilityTest {

	public static void main(String[] args) {

		Leader directorA = new Director("����");

		Leader managerA = new Manager("����");

		Leader generalManagerA = new GeneralManager("����");

		// ������������ϵ
		directorA.setNextLeader(managerA);
		managerA.setNextLeader(generalManagerA);

		// ����
		LeaveRequest leaveRequest1 = new LeaveRequest("С��", 2, "����");

		// 3��
		LeaveRequest leaveRequest2 = new LeaveRequest("С��", 3, "����");

		// 16��
		LeaveRequest leaveRequest3 = new LeaveRequest("С��", 16, "����");

		directorA.handleRequest(leaveRequest1);
		directorA.handleRequest(leaveRequest2);
		directorA.handleRequest(leaveRequest3);
		
	}
}
