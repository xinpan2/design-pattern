package com.xinpaninjava.prototypebuilder;

/**
 * ƽ�������ߣ��Գ������ߵ�ʵ��
 * 
 * ��������ض����͵ľ���ʵ��
 */
public class BungalowBuilder implements Builder {

	@Override
	public void buildCeiling() {
		// ����ԭ��ģʽ��ö���
		PrototypeCeiling ceiling = Factory.getCeiling();
		house.setCeiling(ceiling);
	}

	@Override
	public void buildFloor() {
		// ����ԭ��ģʽ��ö���
		PrototypeFloor floor = Factory.getFloor();
		house.setFloor(floor);
	}

	@Override
	public void buildWall() {
		// ����ԭ��ģʽ��ö���
		PrototypeWall wall = Factory.getWall();
		house.setWall(wall);
	}

	public House getResult() {
		return house;
	}
}
