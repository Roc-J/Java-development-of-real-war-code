package string.test;

/**
 * �ַ�����ת
 * @author Roc-J
 *
 */
public class StringReverse {
	static String text = "���ַ����������Է�ת";
	public static void main(String[] args) {
		System.out.println("ԭ�ַ�����:"+text);
		//ʹ��split
		String[] arrays = text.split("");
		System.out.print("��split��ʵ�ַ�ת��"+"\t");
		for (int i = arrays.length-1; i>=0; i--) {
			System.out.print(arrays[i]);
		}
		System.out.println();
		//ʹ��charAt
		int length = text.length()-1;
		System.out.print("��charAt��ʵ�ַ�ת��"+"\t");
		while(length>=0){
			System.out.print(text.charAt(length));
			length = length-1;
		}
	}

}
