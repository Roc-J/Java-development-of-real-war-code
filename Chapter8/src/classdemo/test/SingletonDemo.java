package classdemo.test;

public class SingletonDemo {

	public static void main(String[] args) {
		CurrentUser userA = CurrentUser.getInstance();
		userA.setName("张明");
		userA.setId(123);
		userA.setLevel(5);
		CurrentUser userB = CurrentUser.getInstance();
		userB.setName("火云邪神");
		System.out.println("UserA的用户名是:"+userA.getName());

		ManagerUser managerA = ManagerUser.getInstance();
		managerA.setName("论坛管理员");
		managerA.setId(3434);
		managerA.setLevel(5);
		ManagerUser managerB = ManagerUser.getInstance();
		managerB.setName("超级管理员");
		System.out.println("当前管理员A："+managerA.getName());
	}

}
