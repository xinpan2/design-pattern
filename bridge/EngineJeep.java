package com.xinpaninjava.bridge;

/**
 * Jeep�ľ���ʵ���࣬���尲װ�������棬��Ҫ��������������ʵ��
 */
public class EngineJeep extends Jeep {
	/**
	 * �ڵ����������ʱ����ָ�������洫����
	 * 
	 * @param engine
	 *            �����������
	 */
	public EngineJeep(Engine engine) {
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
