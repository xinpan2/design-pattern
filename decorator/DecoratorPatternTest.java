package com.xinpaninjava.decorator;

/**
 * װ��ģʽ������
 */
public class DecoratorPatternTest {

	public static void main(String[] args) {
		// ��װ��--��һ����
		ICar car = new RunCar();
		FlyDecorator flyDecorator = new FlyDecorator(car);
		flyDecorator.show();
		System.out.println("------------------------------");

		// ����װ��--�������
		SwimDecorator swimDecorator = new SwimDecorator(flyDecorator);
		swimDecorator.show();
		System.out.println("------------------------------");

		// һ����װ�ζ������
		ICar car2 = new RunCar();

		// �������ǲ��Ǹ�IO����ʹ�÷ǳ����ƣ�
		// BufferedInputStream br=new BufferedInputStream(new DataInputStream(System.in));
		FlyDecorator decorator = new FlyDecorator(new SwimDecorator(car2));
		decorator.show();
	}
}
