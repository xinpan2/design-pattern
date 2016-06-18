package com.xinpaninjava.mediator;

/**
 * 中介者模式测试类
 * 
 * 测试各部门的交互：研发部跟财务部申请资金预算，市场部跟财务部申请资金
 */
public class MediatorTest {

	public static void main(String[] args) {
		// 总经理
		Mediator manager = new Manager();
		// 市场部
		Department market = new Market(manager);
		// 财务部
		Department finacial = new Finacial(manager);
		// 研发部
		Development development = new Development(manager);

		// 研发部跟财务部申请资金预算
		development.submitRequest("finacial");
		System.out.println("=====================================");
		// 市场部跟财务部申请资金
		market.submitRequest("finacial");

	}

}
