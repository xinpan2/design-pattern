package com.xinpaninjava.state;

/**
 * �����״̬֮һ����Ԥ��״̬
 * 
 * �Ƶ귿�䴦����Ԥ��״̬ʱ��Ӧ����ϵͳ����ʾ���Բ��ܱ�Ԥ��
 */
public class BookedRoom implements State {

	@Override
	public void handle() {
		System.out.println("�����ѱ�Ԥ��~~~~~�ȴ���ס��ȡ��Ԥ��~~~!");
	}

}
