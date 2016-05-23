package com.xinpaninjava.builder;

/**
 * 产品类
 * 
 * 这个类是最终要实现的产品，类里面的属性是复杂属性，即不是基本数据类型和String类型
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
