package myclass.test;

/**
 * ��������ת��
 * @author Roc-J
 *
 */
public class TypeConversion {

	public static void main(String[] args) {
		//�Զ�ת����float
		int intNum = 4;
		float floatNum = 9.64f;
		floatNum /=intNum;
		System.out.println("floatNum = " + floatNum);
		
		//ǿ������ת��doubleΪint
		double numX = 2545.4634643;
		double numY = 5454.45346;
		int numZ = (int)numX + (int)numY;
		System.out.println("numZ = "+ numZ);
		
		//ǿ������ת��charΪint
		char charVal = 'R';
		int intVal = (int)charVal;
		System.out.println("intVal = " +intVal);
		
		//ǿ������ת��intΪdouble
		int num1 = 54;
		double num2 = (double)num1/3;
		System.out.println("num2=" + num2);

	}

}
