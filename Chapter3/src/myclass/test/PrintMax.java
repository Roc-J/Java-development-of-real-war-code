package myclass.test;

/**
 * ����������������
 * @author Roc-J
 *
 */
public class PrintMax {

	public static void main(String[] args) {
		int num1 = 345;
		int num2 = 6677;
		String result = num1==num2?"�������":"���������";
		System.out.println("��һ������: "+ num1);
		System.out.println("�ڶ�������: "+ num2);
		System.out.println("�������: "+ (num1>num2?num1:num2));
		System.out.println("�����" + result);
	}

}
