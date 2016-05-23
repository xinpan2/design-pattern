package com.xinpaninjava.prototypebuilder;

/**
 * �������߽ӿڣ��������彨����Ӧ��ӵ�еĹ�����Ϊ
 * 
 * �����������ǽ�����������ʩ����������Ҳ������෵�ؽ��
 */
public interface Builder {
	House house = new House();

	public void buildFloor();

	public void buildCeiling();

	public void buildWall();

	public House getResult();
}
