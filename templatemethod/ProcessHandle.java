package com.xinpaninjava.templatemethod;

/**
 * 银行客户流程处理模板
 * 
 * 用来定义好银行工作人员对于客户请求的流程处理的统一步骤
 */
public abstract class ProcessHandle {
	// 序列号码，用于记录当前第几个排队用户
	private static int sequenceNumber;

	/**
	 * 对外开放取号方法
	 * 
	 * 先让号码加一，再输出当前是第几个客户
	 */
	public void getSequenceNumber() {
		sequenceNumber++;
		System.out.println("您排在第：" + sequenceNumber + "位");
	}

	/**
	 * 具体要办理的业务，在这里设置成抽象方法由子类具体实现
	 */
	public abstract void transact();

	/**
	 * 对本次服务的评价
	 */
	public void comment() {
		System.out.println("处理结束，请对客服作出评价");
	}

	/**
	 * 用于规定流程执行的顺序，并且不能被子类覆写该流程方法
	 */
	public final void process() {
		// 取号
		this.getSequenceNumber();
		// 办理具体业务
		this.transact();
		// 提交评价
		this.comment();
	}
}
