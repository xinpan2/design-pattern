package com.xinpaninjava.builder;

/**
 * 指挥者：我们可以理解成设计师，让它来指导怎样调用哪个队伍建设，及建设的时机
 * 
 * 在这里可以通过接收客户选定的房子类型，请到具体的"生产队"后，设计师根据设计图分配工作
 */
public class Director {
	public House Design(Builder builder) {
		builder.buildFloor();
		builder.buildWall();
		builder.buildCeiling();
		return builder.getResult();
	}
}
