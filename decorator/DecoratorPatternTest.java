package com.xinpaninjava.decorator;

/**
 * 装饰模式测试类
 */
public class DecoratorPatternTest {

	public static void main(String[] args) {
		// 简单装饰--单一功能
		ICar car = new RunCar();
		FlyDecorator flyDecorator = new FlyDecorator(car);
		flyDecorator.show();
		System.out.println("------------------------------");

		// 复合装饰--多个功能
		SwimDecorator swimDecorator = new SwimDecorator(flyDecorator);
		swimDecorator.show();
		System.out.println("------------------------------");

		// 一次性装饰多个功能
		ICar car2 = new RunCar();

		// 看起来是不是跟IO流的使用非常相似？
		// BufferedInputStream br=new BufferedInputStream(new DataInputStream(System.in));
		FlyDecorator decorator = new FlyDecorator(new SwimDecorator(car2));
		decorator.show();
	}
}
