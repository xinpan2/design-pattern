package com.xinpaninjava.chainofresponsibility;

/**
 * 领导的抽象类：用来定义领导类的公共属性和方法
 */
public abstract class Leader {
	// 领导人姓名
	protected String name;
	// 责任链中的后继对象
	protected Leader nextLeader;

	/**
	 *处理请假的方法，由具体领导实现
	 * 
	 * @param leaveRequest
	 *            请假条对象
	 */
	public abstract void handleRequest(LeaveRequest leaveRequest);

	/**
	 * 通过构造函数把领导人姓名传入
	 * 
	 * @param name
	 *            领导人姓名
	 */
	public Leader(String name) {
		super();
		this.name = name;
	}

	/**
	 * 提供设置后继对象的方法
	 */
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

}
