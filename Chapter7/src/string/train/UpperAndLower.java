package string.train;

/**
 * �ַ����Ĵ�дСдת��
 * @author Roc-J
 *
 */
public class UpperAndLower {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "hello java";
		System.out.println("ԭ�ַ���str1:" +str1);
		System.out.println("ԭ�ַ���str2:" +str2);
		System.out.println("=================");
		System.out.println("�ֱ�ת��Сд��");
		System.out.println("str1 toLowerCase():"+str1.toLowerCase());
		System.out.println("str2 toLowerCase():"+str2.toLowerCase());
		System.out.println("=================");
		System.out.println("str1 equals str2?"+str1.equals(str2));
		System.out.println("���Դ�Сд��:");
		System.out.println("str1 equals str2?"+str1.toUpperCase().equals(str2.toUpperCase()));
	}

}
