package myclass.train;

/**
 * ʵ�����100�����ܱ�7��������������ʹ��continue����������������
 * @author Roc-J
 *
 */
public class ContinueNull {

	public static void main(String[] args) {
		System.out.println("100�����ܱ�7������������");
		for (int i = 0; i <= 100; i++) {
			if (i%7!=0) {
				continue;
			}
			System.out.print(i+"��");
		}

	}

}
