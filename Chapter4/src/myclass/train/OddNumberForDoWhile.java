package myclass.train;

/**
 * ʹ��Do-whileѭ����100�������е������ĺ�
 * @author Roc-J
 *
 */
public class OddNumberForDoWhile {

	public static void main(String[] args) {
		int sum=0;
		int number=1;
		do {
			sum+=number;
			number+=2;
		} while (number<=100);
		System.out.println("100�������������ĺ���: " + sum);
	}

}
