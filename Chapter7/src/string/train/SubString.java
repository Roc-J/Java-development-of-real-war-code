package string.train;

/**
 * �ַ����� ��ȡ
 * @author Roc-J
 *
 */
public class SubString {

	public static void main(String[] args) {
		String source = "Hi~nice to meet you~";
		System.out.println("ԭ�ַ�����:"+source);
		String subString = source.substring(3);
		System.out.println("������3λ�ý�ȡ"+source+"��õ�"+subString);
		String substr = source.substring(3, 8);
		System.out.println("������3��8��ȡ"+source+"��õ�"+substr);
	}

}
