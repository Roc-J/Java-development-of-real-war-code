package myclass.train;

/**
 * ʹ��forѭ�����14��98�����й�Լ����
 * @author Roc-J
 *
 */
public class CommonDivisor {

	public static void main(String[] args) {
		int num1=14;
		int num2=98;
		for (int i = 1; i <=num1&&i<=num2 ; i++) {
			if (num1%i==0&&num2%i==0) {
				System.out.println(i+" ��14��98�Ĺ�Լ����");
			}
		}

	}

}
