package myclass.struct;

/**
 * 在主方法中创建不同的数值型变量。将这些变量相加，将和输出。（byte,short,int,long）
 * @author Roc-J
 *
 */
public class Integer {

	public static void main(String[] args) {
		byte myByte = 10;
		short myShort = 2340;
		int myInt = 65455450;
		long myLong = 45245465757765L;
		long result = myByte + myShort +myInt + myLong;
		System.out.println("结果为: " + result);
	}

}
