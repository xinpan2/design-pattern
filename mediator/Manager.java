package com.xinpaninjava.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介类：总经理
 * 
 * 用来实现添加管理部门和按照申请部门的要求让目标部门执行任务
 */
public class Manager implements Mediator {
	// 维护着一个部门列表，存储着可以管理的部门对象
	private Map<String, Department> departments = new HashMap<String, Department>();

	/**
	 * 让相关部门执行任务,即得到目标部门调用其本职工作
	 * 
	 * @param departmentName
	 *            需要执行任务的目标部门名称
	 */
	@Override
	public void command(String departmentName) {

		this.departments.get(departmentName).selfAction();
	}

	/**
	 * 添加新部门
	 */
	@Override
	public void regist(String name, Department department) {
		this.departments.put(name, department);
	}
}
