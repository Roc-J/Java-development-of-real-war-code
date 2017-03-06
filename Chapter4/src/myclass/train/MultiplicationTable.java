package myclass.train;

/**
 * ¾Å¾Å³Ë·¨±íÊä³ö
 * @author Roc-J
 *
 */
public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				String str = j +"*" + i +"="+(j*i);
				System.out.print(str+"\t");
			}
			System.out.println();
		}
	}
}
