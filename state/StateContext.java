package com.xinpaninjava.state;

/**
 * �Ƶ귿��״̬�������ģ��û�״̬����л�
 * 
 * ���ö���state����ǰ��״̬
 */
public class StateContext {

	private State state;

	public State getState() {
		return state;
	}

	/**
	 * ״̬���л�
	 */
	public void setState(State state) {
		this.state = state;
		System.out.println("״̬�޸ĳɹ�");
		this.state.handle();
	}

}
