package com.xinpaninjava.chainofresponsibility;

/**
 * ������ģʽ������2�����ڲ���Ա���Ĵ��� 10-20�����
 */
public class ChainOfResponsibilityTest2 {

	public static void main(String[] args) {

		Leader directorA = new Director("����");

		Leader managerA = new Manager("����");
		// �����ĸ��ܾ���
		Leader viceManagerA = new ViceGeneralManager("����");

		Leader generalManagerA = new GeneralManager("����");

		// ������������ϵ
		directorA.setNextLeader(managerA);

		managerA.setNextLeader(viceManagerA);

		viceManagerA.setNextLeader(generalManagerA);

		// ����

		// 16��
		LeaveRequest leaveRequest3 = new LeaveRequest("С��", 16, "����");

		directorA.handleRequest(leaveRequest3);

	}
}