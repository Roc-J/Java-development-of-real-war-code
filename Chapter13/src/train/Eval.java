package train;

import java.util.Date;

/**
 * ���ڵĸ�ʽ�����
 * @author Roc-J
 *
 */
public class Eval {

	public static void main(String[] args) {
		Date now = new Date();
		String year = String.format("%tY", now);
		String month = String.format("%tB", now);
		String day = String.format("%td", now);
		System.out.println("������: " + year + "��" );
		System.out.println("������: " + month);
		System.out.println("������: " + day+"��");
	}

}
