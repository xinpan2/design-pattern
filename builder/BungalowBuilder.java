package com.xinpaninjava.builder;

/**
 * 平房建造者：对抽象建造者的实现
 * 
 * 负责各种特定类型的具体实现
 */
public class BungalowBuilder implements Builder {

	@Override
	public void buildCeiling() {
		Ceiling ceiling = new Ceiling();
		ceiling.setColor("white");
		ceiling.setLength(10);
		ceiling.setWidth(10);
		house.setCeiling(ceiling);
	}

	@Override
	public void buildFloor() {
		Floor floor = new Floor();
		floor.setColor("orange");
		floor.setLength(10);
		floor.setWidth(10);
		house.setFloor(floor);
	}

	@Override
	public void buildWall() {
		Wall wall = new Wall();
		wall.setColor("white");
		wall.setHeight(4.5);
		wall.setLength(9.8);
		wall.setWidth(0.2);
		wall.setQuantity(12);
		house.setWall(wall);
	}

	public House getResult() {
		return house;
	}
}
