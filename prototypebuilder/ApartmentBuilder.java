package com.xinpaninjava.prototypebuilder;

/**
 * 公寓建造者：对抽象建造者的实现
 * 
 * 负责各种特定类型的具体实现
 */
public class ApartmentBuilder implements Builder {

	@Override
	public void buildCeiling() {
		// 借助原型模式浅克隆对象
		PrototypeCeiling ceiling = Factory.getCeiling();
		ceiling.setLength(8);
		ceiling.setWidth(7);
		house.setCeiling(ceiling);
	}

	@Override
	public void buildFloor() {
		// 借助原型模式浅克隆对象
		PrototypeFloor floor = Factory.getFloor();
		floor.setLength(8);
		floor.setWidth(7);
		house.setFloor(floor);
	}

	@Override
	public void buildWall() {
		// 借助原型模式浅克隆对象
		PrototypeWall wall = Factory.getWall();
		wall.setHeight(4);
		wall.setLength(7.8);
		wall.setQuantity(8);
		house.setWall(wall);
	}

	public House getResult() {
		return house;
	}
}
