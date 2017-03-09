package classdemo.test;

public class SingletonDemo {

	public static void main(String[] args) {
		CurrentUser userA = CurrentUser.getInstance();
		userA.setName("����");
		userA.setId(123);
		userA.setLevel(5);
		CurrentUser userB = CurrentUser.getInstance();
		userB.setName("����а��");
		System.out.println("UserA���û�����:"+userA.getName());

		ManagerUser managerA = ManagerUser.getInstance();
		managerA.setName("��̳����Ա");
		managerA.setId(3434);
		managerA.setLevel(5);
		ManagerUser managerB = ManagerUser.getInstance();
		managerB.setName("��������Ա");
		System.out.println("��ǰ����ԱA��"+managerA.getName());
	}

}
