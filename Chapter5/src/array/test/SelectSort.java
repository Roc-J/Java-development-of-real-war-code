package array.test;

/**
 * 使用直接排序法进行排序
 * @author Roc-J
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] array = new int[]{23,1,54,65,75,66,78,9,56};
		System.out.println("原数组是:");
		printArray(array);
		System.out.println("使用直接选择排序法进行排序");
		for (int i = 1; i < array.length; i++) {
			int index = 0;
			for (int j = 1; j < array.length-i; j++) {
				if (array[j]>array[index]) {
					index = j;
				}
			}
			//交换
			int temp = array[array.length-i];
			array[array.length-i]=array[index];
			array[index]=temp;
		}
		printArray(array);

	}
	
	/**
	 * 输出数组内容并换行
	 * @param array
	 */
	public static void printArray(int[] array){
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
