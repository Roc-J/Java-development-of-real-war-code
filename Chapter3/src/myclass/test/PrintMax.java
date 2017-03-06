package myclass.test;

/**
 * 输出两个数的最大数
 * @author Roc-J
 *
 */
public class PrintMax {

	public static void main(String[] args) {
		int num1 = 345;
		int num2 = 6677;
		String result = num1==num2?"两数相等":"两数不相等";
		System.out.println("第一个数是: "+ num1);
		System.out.println("第二个数是: "+ num2);
		System.out.println("最大数是: "+ (num1>num2?num1:num2));
		System.out.println("结果是" + result);
	}

}
