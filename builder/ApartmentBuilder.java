package com.xinpaninjava.builder;

/**
 * ��Ԣ�����ߣ��Գ������ߵ�ʵ��
 * 
 * ��������ض����͵ľ���ʵ��
 */
public class ApartmentBuilder implements Builder {

	@Override
	public void buildCeiling() {
		Ceiling ceiling = new Ceiling();
		ceiling.setColor("white");
		ceiling.setLength(8);
		ceiling.setWidth(7);
		house.setCeiling(ceiling);
	}

	@Override
	public void buildFloor() {
		Floor floor = new Floor();
		floor.setColor("orange");
		floor.setLength(8);
		floor.setWidth(7);
		house.setFloor(floor);
	}

	@Override
	public void buildWall() {
		Wall wall = new Wall();
		wall.setColor("white");
		wall.setHeight(4);
		wall.setLength(7.8);
		wall.setWidth(0.2);
		wall.setQuantity(8);
		house.setWall(wall);
	}

	public House getResult() {
		return house;
	}
}
