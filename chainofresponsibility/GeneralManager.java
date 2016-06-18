package com.xinpaninjava.chainofresponsibility;

/**
 * 总经理类：用于处理20天以上的假条
 */
public class GeneralManager extends Leader {
	/**
	 * 通过构造函数把领导人姓名传入
	 * 
	 * @param name
	 *            领导人姓名
	 */
	public GeneralManager(String name) {
		super(name);
	}

	/**
	 * 处理请假条的具体实现方法
	 * 
	 * 当前是总经理类，用于处理请假天数在 20~30天的假条，超过30天不处理
	 * 
	 */
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getDays() < 30) {
			System.out.println("姓名：" + leaveRequest.getEmployeeName()
					+ ",请假天数:" + leaveRequest.getDays() + ",理由："
					+ leaveRequest.getReason());
			System.out.println("审批人：" + this.name + "总经理");
		} else {
			// 若假条天数超过30天，拒绝
			System.out.println("拒绝请假，难道这" + leaveRequest.getEmployeeName()
					+ "不想干了？");
		}
	}

}
