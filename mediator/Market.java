package com.xinpaninjava.mediator;

/**
 * 市场部
 */
public class Market implements Department {
	// 有经理类的引用
	private Mediator manager;

	/**
	 * 本职工作
	 */
	@Override
	public void selfAction() {
		System.out.println("跑市场，接项目~!");
	}

	/**
	 * 向总经理提交申请
	 */
	@Override
	public void submitRequest(String departmentName) {
		this.manager.command(departmentName);
	}

	/**
	 * 构造函数：初始化对象时把经理类传过来并且把当前部门添加到经理管理队列
	 * 
	 * @param manager
	 *            经理类
	 */
	public Market(Mediator manager) {
		this.manager = manager;
		this.manager.regist("market", this);
	}

}
