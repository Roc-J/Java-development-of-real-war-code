package array.train;

/**
 * 输出2维数组
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
		
		System.out.println("输出二维数组...");
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				System.out.print(Matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
