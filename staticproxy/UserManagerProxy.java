package com.xinpaninjava.staticproxy;

/**
 * �û�����Ĵ�����-�������û�����ľ���ʵ���й�ͬ�Ľӿ�
 * 
 * ��Ϊ�������ɿͻ��˵��ã����Գ���Ա�����޸�������ʵ��������û����ú���û�仯һ��
 * 
 * �����������ҪΪÿ����������Ȩ�޵��жϣ�Ϊ���ڲ�Ӱ��ԭ�д����ǰ���£�ʹ�þ�̬����
 * 
 * Ϊÿһ����ҪȨ�޹���ķ�������Ȩ�޹���
 * 
 */
public class UserManagerProxy implements UserManager {
	// ������һ������ʵ�ֵ�����
	private UsermManagerImpl managerImpl;

	/**
	 * ͨ�����캯���ѱ��������ʵ��������
	 * 
	 * @param managerImpl
	 *            ���������ʵ��
	 */
	public UserManagerProxy(UsermManagerImpl managerImpl) {
		super();
		this.managerImpl = managerImpl;
	}

	/**
	 * ����û������Ⱦ����ж��Ƿ���Ȩ�ޣ���ִ�о��巽�����������Ȩ�ޣ��򲻻����������ȥ
	 */
	@Override
	public void addUser(String userNanme, String password) {
		checkSecurity();
		// ���Ȩ���㹻�����þ���ʵ�ֵķ���
		managerImpl.addUser(userNanme, password);
	}

	/**
	 * ����idɾ���û���ԭ��ͬ��
	 */
	@Override
	public void deleteUserById(int id) {
		checkSecurity();
		managerImpl.deleteUserById(id);
	}

	/**
	 * ���������û�
	 */
	@Override
	public String findAllUsers() {
		checkSecurity();
		Object result = managerImpl.findAllUsers();
		return (String) result;
	}

	/**
	 * ����id�����û�
	 */
	@Override
	public String findUserById(int id) {
		checkSecurity();
		Object result = managerImpl.findUserById(id);
		return (String) result;
	}

	/**
	 * �޸��û�
	 */
	@Override
	public void updateUser(int id, String userName, String password) {
		checkSecurity();
		managerImpl.updateUser(id, userName, password);
	}

	/**
	 * Ȩ���жϵķ���
	 */
	private void checkSecurity() {
		System.out.println("����Ȩ���ж�~~~~~~~~~~~~~~~~~~����������");
	}

}
