package com.xinpaninjava.prototypebuilder;

public class Factory {
	public static PrototypeFloor getFloor() {
		PrototypeFloor floor = new PrototypeFloor();
		floor.setColor("orange");
		floor.setLength(10);
		floor.setWidth(10);
		try {
			return floor.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(
					"the class hasn't implemented the Clonable interface");
		}
	}

	public static PrototypeCeiling getCeiling() {
		PrototypeCeiling ceiling = new PrototypeCeiling();
		ceiling.setColor("white");
		ceiling.setLength(10);
		ceiling.setWidth(10);
		try {
			return ceiling.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(
					"the class hasn't implemented the Clonable interface");
		}
	}

	public static PrototypeWall getWall() {
		PrototypeWall wall = new PrototypeWall();
		wall.setColor("white");
		wall.setHeight(4.5);
		wall.setLength(9.8);
		wall.setWidth(0.2);
		wall.setQuantity(12);
		try {
			return wall.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(
					"the class hasn't implemented the Clonable interface");
		}
	}
}
