package com.xinpaninjava.state;

/**
 * �����״̬֮һ��δԤ��״̬
 * 
 * �Ƶ귿�䴦��δԤ��״̬ʱ��Ӧ����ϵͳ����ʾ���Ա�Ԥ��
 */
public class UnBookedRoom implements State {

	@Override
	public void handle() {
		System.out.println("��ǰ����δ��Ԥ�����˿Ϳ���Ԥ��~!");
	}

}
