package myclass.struct;

/**
 * 在主方法中定义变量，使用赋值运算符为变量赋值。
 * @author Roc-J
 *
 */
public class Eval {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		a = 15;
		c = b = a+4;
		a +=1;
		System.out.println("a的值是:"+a);
		System.out.println("b的值是:"+b);
		System.out.println("c的值是:"+c);
	}

}
