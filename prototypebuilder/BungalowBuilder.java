package com.xinpaninjava.prototypebuilder;

/**
 * 平房建造者：对抽象建造者的实现
 * 
 * 负责各种特定类型的具体实现
 */
public class BungalowBuilder implements Builder {

	@Override
	public void buildCeiling() {
		// 根据原型模式获得对象
		PrototypeCeiling ceiling = Factory.getCeiling();
		house.setCeiling(ceiling);
	}

	@Override
	public void buildFloor() {
		// 根据原型模式获得对象
		PrototypeFloor floor = Factory.getFloor();
		house.setFloor(floor);
	}

	@Override
	public void buildWall() {
		// 根据原型模式获得对象
		PrototypeWall wall = Factory.getWall();
		house.setWall(wall);
	}

	public House getResult() {
		return house;
	}
}
