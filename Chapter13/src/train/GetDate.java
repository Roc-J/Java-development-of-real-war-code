package train;

import java.util.Date;

/**
 * �����ڸ�ʽ������ʾ��00ʱ00��00��
 * @author Roc-J
 *
 */
public class GetDate {

	public static void main(String[] args) {
		Date now = new Date();
		String hour = String.format("%tH", now);
		String Minutes = String.format("%tM", now);
		String Second = String.format("%tS", now);
		System.out.println("������"+hour+"ʱ"+Minutes+"��"+Second+"��");

	}

}
