package myclass.train;

/**
 * ½ğ×ÖËşÊä³ö
 * @author Roc-J
 *
 */
public class Pyramid {

	public static void main(String[] args) {
		int row=13;
		for (int i = 1; i <=13; i++) {
			for (int j = row; j>=i ; j--) {
				System.out.print("   ");
			}
			for (int j=i;j>=1;j--) {
				System.out.print(j<10?"  "+j:" "+j);
			}
			for(int j=2;j<=i;j++){
				System.out.print(j<10?"  "+j:" "+j);
			}
			System.out.println();
		}

	}

}
