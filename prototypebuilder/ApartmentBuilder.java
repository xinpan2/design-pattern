package com.xinpaninjava.prototypebuilder;

/**
 * ��Ԣ�����ߣ��Գ������ߵ�ʵ��
 * 
 * ��������ض����͵ľ���ʵ��
 */
public class ApartmentBuilder implements Builder {

	@Override
	public void buildCeiling() {
		// ����ԭ��ģʽǳ��¡����
		PrototypeCeiling ceiling = Factory.getCeiling();
		ceiling.setLength(8);
		ceiling.setWidth(7);
		house.setCeiling(ceiling);
	}

	@Override
	public void buildFloor() {
		// ����ԭ��ģʽǳ��¡����
		PrototypeFloor floor = Factory.getFloor();
		floor.setLength(8);
		floor.setWidth(7);
		house.setFloor(floor);
	}

	@Override
	public void buildWall() {
		// ����ԭ��ģʽǳ��¡����
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
