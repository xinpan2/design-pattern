package com.xinpaninjava.mediator;

/**
 * 财务部
 */
public class Finacial implements Department {
	// 对经理类的引用
	private Mediator manager;

	/**
	 * 本职工作
	 */
	@Override
	public void selfAction() {
		System.out.println("统计资金，管理财务，分配预算资金~~~!");
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
	public Finacial(Mediator manager) {
		this.manager = manager;
		this.manager.regist("finacial", this);
	}

}
