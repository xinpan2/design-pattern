package com.xinpaninjava.prototypebuilder;

/**
 * 抽象建造者接口，用来定义建造者应该拥有的公共行为
 * 
 * 在这里由于是建造者来负责”施工“，所以也由这个类返回结果
 */
public interface Builder {
	House house = new House();

	public void buildFloor();

	public void buildCeiling();

	public void buildWall();

	public House getResult();
}
