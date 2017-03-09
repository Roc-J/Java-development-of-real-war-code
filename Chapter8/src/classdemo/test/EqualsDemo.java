package classdemo.test;

public class EqualsDemo {

	public static void main(String[] args) {
		User userA = new User();
		userA.setName("菲菲");
		userA.setId(123);
		userA.setLevel(5);
		
		User userB = new User();
		userB.setName("菲菲");
		userB.setId(123);
		userB.setLevel(5);
		
		System.out.println("userA equals userB:"+userA.equals(userB));
		userB.setName("飞飞");
		System.out.println("用户B改名后：");
		System.out.println("userA equals userB: "+userA.equals(userB));
	}

}
