package com.xinpaninjava.chainofresponsibility;

/**
 * 副总经理类：用来处理10-20天的假条
 */
public class ViceGeneralManager extends Leader {

	/**
	 * 通过构造函数把领导人姓名传入
	 * 
	 * @param name
	 *            领导人姓名
	 */
	public ViceGeneralManager(String name) {
		super(name);
	}

	/**
	 * 处理请假条的具体实现方法
	 * 
	 * 副总经理类，用于处理请假天数在10-20天的假条，
	 * 
	 * 如果多于20天，交给后继对象处理
	 */
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getDays() < 20) {
			System.out.println("姓名：" + leaveRequest.getEmployeeName()
					+ ",请假天数:" + leaveRequest.getDays() + ",理由："
					+ leaveRequest.getReason());
			System.out.println("审批人：" + this.name + "副总经理");
		} else {
			// 若假条天数大于20且后继处理对象不为空，给后继对象处理
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(leaveRequest);
			}
		}
	}

}
