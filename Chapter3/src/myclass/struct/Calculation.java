package myclass.struct;

/**
 * 输出与，或，非逻辑关系的运算结果。
 * @author Roc-J
 *
 */
public class Calculation {

	public static void main(String[] args) {
		int a =2;
		int b=5;
		boolean result = ((a>b)&&(a!=b));
		System.out.println("(2>5)&&(2!=5)="+result);

	}

}
