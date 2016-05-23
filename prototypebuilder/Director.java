package com.xinpaninjava.prototypebuilder;

public class Director {
	public House Design(Builder builder) {
		builder.buildCeiling();
		builder.buildFloor();
		builder.buildWall();
		return builder.getResult();
	}
}
