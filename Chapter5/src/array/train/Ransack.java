package array.train;

/**
 * 遍历三维数组
 * @author Roc-J
 *
 */
public class Ransack {

	public static void main(String[] args) {
		int array[][][] = new int[3][3][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					array[i][j][k] = i+j+k;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					System.out.print(array[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		for (int[][] is : array) {
			for (int[] is2 : is) {
				for (int i : is2) {
					System.out.print(i+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
