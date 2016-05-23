package com.xinpaninjava.builder;

/**
 * ��Ʒ��
 * 
 * �����������Ҫʵ�ֵĲ�Ʒ��������������Ǹ������ԣ������ǻ����������ͺ�String����
 */
public class House {
	private Floor floor;
	private Ceiling ceiling;
	private Wall wall;

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	public Ceiling getCeiling() {
		return ceiling;
	}

	public void setCeiling(Ceiling ceiling) {
		this.ceiling = ceiling;
	}

	public Wall getWall() {
		return wall;
	}

	public void setWall(Wall wall) {
		this.wall = wall;
	}

	@Override
	public String toString() {
		return "ceiling :" + ceiling + "\nfloor :\t " + floor + "\nwall :\t "
				+ wall;
	}

}
