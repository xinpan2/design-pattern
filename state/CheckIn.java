package com.xinpaninjava.state;

/**
 * �����״̬֮һ������ס
 * 
 * �Ƶ귿�䴦������ס״̬ʱ��Ӧ����ϵͳ����ʾ�����˷�������
 */
public class CheckIn implements State {

	@Override
	public void handle() {
		System.out.println("���Խ����˷����������� ~~~~!");
	}

}
