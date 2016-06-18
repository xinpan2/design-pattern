package com.xinpaninjava.chainofresponsibility;

/**
 * 请假条类：用来给员工填写请假信息
 */
public class LeaveRequest {
	// 员工姓名
	private String employeeName;
	// 请假天数
	private int days;
	// 原因
	private String reason;

	/**
	 * 通过构造函数把参数传进来
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
