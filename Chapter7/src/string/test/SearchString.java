package string.test;

/**
 * ����������ʹ��indexOf()
 * @author Roc-J
 *
 */
public class SearchString {
	public final static String text = "��Ա�������������ж���ı���"
			+ "��ȫ�ֱ�������Ա�������ڶ�������״̬��";
	
	public static void main(String[] args) {
		String str = "����";
		int res = 0;
		while(res!=-1){
			res = text.indexOf(str, res+1);
			if(res>=0){
				System.out.println("�������ַ���text����λ��Ϊ"+res+"��");
			}				
		}
	}
}
