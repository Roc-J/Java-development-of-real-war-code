package myclass.struct;

/**
 * 在主方法中创建不同数值类型的变量，实现各变量的自动类型转换
 * @author Roc-J
 *
 */
public class Convesion {

	public static void main(String[] args) {
		byte b1 = 34;
		short s1 = 123;
		char c1 = 'B';
		int i1 = 40;
		long l1 = 454356L;
		float f1 = 6654.45F;
		double d1 = 3.14159;
		System.out.println("double/byte+char->double\t"+ (d1/b1+c1));
		System.out.println("long+short->long\t"+ (l1+s1));
		System.out.println("char+byte+short->float\t"+ (c1+b1+s1));
		System.out.println("float+b1/s1->flaot\t"+ (f1+b1/s1));
		System.out.println("int + double->double\t"+ (i1+d1));
	}

}
