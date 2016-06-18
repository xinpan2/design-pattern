package com.xinpaninjava.mediator;

/**
 * 中介接口：中介类的抽象接口，用来定义中介类的公共行为
 */
public interface Mediator {
	/**
	 * 注册部门，即把需要总经理管理的部门添加进来
	 */
	public void regist(String name, Department department);

	/**
	 * 命令指定的部门执行任务
	 */
	public void command(String departmentName);
}
