package com.xinpaninjava.bridge;

/**
 * ��ʿʵ���࣬���尲װ�������棬��Ҫ��������������ʵ��
 */
public class EngineBus extends Bus {
	/**
	 * �ڵ����������ʱ����ָ�������洫����
	 * 
	 * @param engine
	 *            �����������
	 */
	public EngineBus(Engine engine) {
		super(engine);
	}

	/**
	 * ��װ���������
	 */
	@Override
	public void installEngine() {
		this.getEngine().installEngine();
	}

}
