package exception.train;

/**
 * ʹ��try-catch��佫���ܷ������쳣�������쳣����
 * @author Roc-J
 *
 */
public class Take {

	public static void main(String[] args) {
		try {
			String str = "lili";
			System.out.println(str+"��������:");
			int age = Integer.parseInt("20L");
			System.out.println(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("�������");
	}

}
