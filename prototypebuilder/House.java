package com.xinpaninjava.prototypebuilder;

/**
 * ��Ʒ��
 * 
 * �����������Ҫʵ�ֵĲ�Ʒ��������������Ǹ������ԣ������ǻ����������ͺ�String����
 */
public class House {
	private PrototypeFloor floor;
	private PrototypeCeiling ceiling;
	private PrototypeWall wall;

	public PrototypeFloor getFloor() {
		return floor;
	}

	public void setFloor(PrototypeFloor floor) {
		this.floor = floor;
	}

	public PrototypeCeiling getCeiling() {
		return ceiling;
	}

	public void setCeiling(PrototypeCeiling ceiling) {
		this.ceiling = ceiling;
	}

	public PrototypeWall getWall() {
		return wall;
	}

	public void setWall(PrototypeWall wall) {
		this.wall = wall;
	}

	@Override
	public String toString() {
		return "ceiling :" + ceiling + "\nfloor :\t " + floor + "\nwall :\t "
				+ wall;
	}

}
