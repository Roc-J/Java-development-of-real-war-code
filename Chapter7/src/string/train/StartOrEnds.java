package string.train;

/**
 * �ַ����Ŀ�ͷ���β
 * @author Roc-J
 *
 */
public class StartOrEnds {

	public static void main(String[] args) {
		String str1 = "1212234566";
		String str2 = "3467678956";
		System.out.println("�ַ���"+str1+"����12��ͷ��ô��"+str1.startsWith("12"));
		System.out.println("�ַ���"+str1+"����56��β��ô��"+str1.endsWith("56"));
		System.out.println("�ַ���"+str2+"����12��ͷ��ô��"+str1.startsWith("12"));
		System.out.println("�ַ���"+str2+"����56��β��ô��"+str1.endsWith("56"));
	}

}
