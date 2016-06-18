package com.xinpaninjava.chainofresponsibility;

/**
 * ������ࣺ������Ա����д�����Ϣ
 */
public class LeaveRequest {
	// Ա������
	private String employeeName;
	// �������
	private int days;
	// ԭ��
	private String reason;

	/**
	 * ͨ�����캯���Ѳ���������
	 * 
	 * @param employeeName
	 * @param days
	 * @param reason
	 */
	public LeaveRequest(String employeeName, int days, String reason) {
		super();
		this.employeeName = employeeName;
		this.days = days;
		this.reason = reason;
	}

	// getter
	public String getEmployeeName() {
		return employeeName;
	}

	public int getDays() {
		return days;
	}

	public String getReason() {
		return reason;
	}

}
