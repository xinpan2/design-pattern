package com.xinpaninjava.chainofresponsibility;

/**
 * 主管类：处于责任链的第一个对象
 * 
 * 用于审批请假天数少于3天的假条
 * 
 */
public class Director extends Leader {
	/**
	 * 通过构造函数把领导人姓名传入
	 * 
	 * @param name
	 *            领导人姓名
	 */
	public Director(String name) {
		super(name);
	}

	/**
	 * 处理请假条的具体实现方法
	 * 
	 * 当前是主管类，处理少于3天的假条，如果多于三天，交给后继对象处理
	 */
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getDays() < 3) {
			System.out.println("姓名：" + leaveRequest.getEmployeeName()
					+ ",请假天数:" + leaveRequest.getDays() + ",理由："
					+ leaveRequest.getReason());
			System.out.println("审批人：" + this.name + "主管");
		} else {
			// 若假条天数大于3且后继处理对象不为空，给后继对象处理
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(leaveRequest);
			}
		}
	}

}
