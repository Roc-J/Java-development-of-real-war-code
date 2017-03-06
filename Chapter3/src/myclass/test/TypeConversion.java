package myclass.test;

/**
 * 数据类型转换
 * @author Roc-J
 *
 */
public class TypeConversion {

	public static void main(String[] args) {
		//自动转换成float
		int intNum = 4;
		float floatNum = 9.64f;
		floatNum /=intNum;
		System.out.println("floatNum = " + floatNum);
		
		//强制类型转换double为int
		double numX = 2545.4634643;
		double numY = 5454.45346;
		int numZ = (int)numX + (int)numY;
		System.out.println("numZ = "+ numZ);
		
		//强制类型转换char为int
		char charVal = 'R';
		int intVal = (int)charVal;
		System.out.println("intVal = " +intVal);
		
		//强制类型转换int为double
		int num1 = 54;
		double num2 = (double)num1/3;
		System.out.println("num2=" + num2);

	}

}
