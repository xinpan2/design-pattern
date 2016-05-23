package com.xinpaninjava.prototypebuilder;

/**
 * 产品类
 * 
 * 这个类是最终要实现的产品，类里面的属性是复杂属性，即不是基本数据类型和String类型
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
