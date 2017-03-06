package myclass.test;

/**
 * 数据类型转换
 * @author Roc-J
 *
 */
public class ExpressionCompute {

	public static void main(String[] args) {
		int intNum = 1;
		double doubleNum = 1.0;
		intNum = 544/6;
		System.out.println("intNum = " + intNum);
		intNum = 46%9+4*4-2;
		System.out.println("intNum = " + intNum);
		intNum =1;
		intNum %= 3/intNum +3;
		System.out.println("intNum=" + intNum);
		doubleNum = 4+ doubleNum*doubleNum +4;
		System.out.println("doubleNum=" + doubleNum);

	}

}
