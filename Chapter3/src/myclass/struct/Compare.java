package myclass.struct;

/**
 * 在主方法中创建整形变量，使用比较运算符对变量进行比较运算，将运算的结果输出。
 * @author Roc-J
 *
 */
public class Compare {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;
		System.out.println("4==5的返回值是 : " + (num1==num2));
		System.out.println("4!=5的返回值是 : " + (num1!=num2));
		System.out.println("4 < 5的返回值是 : " + (num1<num2));
		System.out.println("4 > 5的返回值是 : " + (num1>num2));
		System.out.println("4 >=5的返回值是 : " + (num1>=num2));
		System.out.println("4<=5的返回值是 : " + (num1<=num2));
	}

}
