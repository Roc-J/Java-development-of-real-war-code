package string.train;

/**
 * �����ַ�a���ַ����е�����λ��
 * @author Roc-J
 *
 */
public class StringIndexOf {

	public static void main(String[] args) {
		String str = "We are studnets";
		int index = str.indexOf("a");
		System.out.println("a���ַ���"+str+"�е�����λ����:"+index);
		int lastindex = str.lastIndexOf("s");
		System.out.println("s���ַ������������λ����: "+ lastindex);
		System.out.println("�ַ���"+str+"�ĳ�����"+str.length());
	}

}
