package com.xinpaninjava.builder;

/**
 * ָ���ߣ����ǿ����������ʦ��������ָ�����������ĸ����齨�裬�������ʱ��
 * 
 * ���������ͨ�����տͻ�ѡ���ķ������ͣ��뵽�����"������"�����ʦ�������ͼ���乤��
 */
public class Director {
	public House Design(Builder builder) {
		builder.buildFloor();
		builder.buildWall();
		builder.buildCeiling();
		return builder.getResult();
	}
}
