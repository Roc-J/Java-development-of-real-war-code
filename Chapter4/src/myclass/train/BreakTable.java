package myclass.train;

/**
 * ���žų˷���˻�����16ʱ����ֹ���ѭ����
 * @author Roc-J
 *
 */
public class BreakTable {

	public static void main(String[] args) {
	loop:for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				if(i*j>16){
					break loop;
				}
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}

	}

}
