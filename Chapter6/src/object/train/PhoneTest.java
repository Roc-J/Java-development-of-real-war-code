package object.train;

public class PhoneTest {

	public static void main(String[] args) {
		Phone.PhoneInfo();
		System.out.println("==========================");
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone();
		System.out.println("�ֻ�p1�Ĳ�������" + p1.yieldAddress);
		System.out.println("�ֻ�p2�Ĳ�������" + p2.yieldAddress);
		System.out.println("�ֻ�p3�Ĳ�������" + p3.yieldAddress);
		p2.yieldAddress="�й��㶫������";
		System.out.println("==========================");
		System.out.println("�޸�������֮��");
		System.out.println("�ֻ�p1�Ĳ�������" + p1.yieldAddress);
		System.out.println("�ֻ�p2�Ĳ�������" + p2.yieldAddress);
		System.out.println("�ֻ�p3�Ĳ�������" + p3.yieldAddress);
	}

}
