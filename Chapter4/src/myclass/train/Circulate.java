package myclass.train;

/**
 * ʹ��forѭ������100���ڣ�����100������ż��֮��
 * @author Roc-J
 *
 */
public class Circulate {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 0; i <= 100; i+=2) {
			sum+=i;
		}
		System.out.println("100��������ż��֮���ǣ�"+sum);
	}

}
