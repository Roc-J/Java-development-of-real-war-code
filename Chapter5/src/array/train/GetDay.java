package array.train;

/**
 * ���������д���int�����飬��ʵ�ֽ����µ��������
 * @author Roc-J
 *
 */
public class GetDay {

	public static void main(String[] args) {
		int DayMonth[] =  {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < DayMonth.length; i++) {
			System.out.println("��"+(i+1)+"����"+DayMonth[i]+"��");
		}
	}

}
