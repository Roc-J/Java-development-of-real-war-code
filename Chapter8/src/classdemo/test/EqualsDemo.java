package classdemo.test;

public class EqualsDemo {

	public static void main(String[] args) {
		User userA = new User();
		userA.setName("�Ʒ�");
		userA.setId(123);
		userA.setLevel(5);
		
		User userB = new User();
		userB.setName("�Ʒ�");
		userB.setId(123);
		userB.setLevel(5);
		
		System.out.println("userA equals userB:"+userA.equals(userB));
		userB.setName("�ɷ�");
		System.out.println("�û�B������");
		System.out.println("userA equals userB: "+userA.equals(userB));
	}

}
