package com.xinpaninjava.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * �н��ࣺ�ܾ���
 * 
 * ����ʵ����ӹ����źͰ������벿�ŵ�Ҫ����Ŀ�겿��ִ������
 */
public class Manager implements Mediator {
	// ά����һ�������б��洢�ſ��Թ���Ĳ��Ŷ���
	private Map<String, Department> departments = new HashMap<String, Department>();

	/**
	 * ����ز���ִ������,���õ�Ŀ�겿�ŵ����䱾ְ����
	 * 
	 * @param departmentName
	 *            ��Ҫִ�������Ŀ�겿������
	 */
	@Override
	public void command(String departmentName) {

		this.departments.get(departmentName).selfAction();
	}

	/**
	 * ����²���
	 */
	@Override
	public void regist(String name, Department department) {
		this.departments.put(name, department);
	}
}
