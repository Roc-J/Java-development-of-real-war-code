package string.train;

/**
 * �ַ����ķָ�split()
 * @author Roc-J
 *
 */
public class Division {

	public static void main(String[] args) {
		String str = "china,english,american,Indien";
		System.out.println("ԭ�ַ�����");
		System.out.println(str);
		System.out.println("�Զ��ŷָ��:");
		String[] countries = str.split(",");
		for (String string : countries) {
			System.out.println(string);
		}
		String[] splitItems = str.split(",", 2);
		System.out.println("ֻ����ָ�2�Σ������");
		for (String string : splitItems) {
			System.out.println(string);
		}
	}

}
