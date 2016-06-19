package com.xinpaninjava.state;

/**
 * ״̬ģʽ�����ࣺ���ڲ����л���ͬ״̬ʱ����Ϊ
 */
public class Client {

	public static void main(String[] args) {
		StateContext stateContext = new StateContext();

		// ��һ��״̬
		stateContext.setState(new UnBookedRoom());

		// �ڶ���״̬
		stateContext.setState(new BookedRoom());

		// ������״̬
		stateContext.setState(new CheckIn());
	}

}
