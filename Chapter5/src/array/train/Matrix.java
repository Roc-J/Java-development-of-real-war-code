package array.train;

/**
 * ���2ά����
 * @author Roc-J
 *
 */
public class Matrix {

	public static void main(String[] args) {
		int Matrix[][] =new int[3][4];
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				Matrix[i][j] = i+j;
			}
		}
		
		System.out.println("�����ά����...");
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				System.out.print(Matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
