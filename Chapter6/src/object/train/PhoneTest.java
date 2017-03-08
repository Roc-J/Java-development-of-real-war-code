package object.train;

public class PhoneTest {

	public static void main(String[] args) {
		Phone.PhoneInfo();
		System.out.println("==========================");
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone();
		System.out.println("手机p1的产地是在" + p1.yieldAddress);
		System.out.println("手机p2的产地是在" + p2.yieldAddress);
		System.out.println("手机p3的产地是在" + p3.yieldAddress);
		p2.yieldAddress="中国广东深圳市";
		System.out.println("==========================");
		System.out.println("修改类属性之后");
		System.out.println("手机p1的产地是在" + p1.yieldAddress);
		System.out.println("手机p2的产地是在" + p2.yieldAddress);
		System.out.println("手机p3的产地是在" + p3.yieldAddress);
	}

}
