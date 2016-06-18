package com.xinpaninjava.mediator;

/**
 * 需要解耦的交互接口:部门接口
 */
public interface Department {
	/**
	 * 某个部门的本职工作
	 */
	public void selfAction();

	/**
	 * 向总经理提交申请
	 * 
	 * @param departmentName
	 *            目标部门类
	 */
	public void submitRequest(String departmentName);
}
