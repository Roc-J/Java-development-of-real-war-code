package array.test;

/**
 * ʹ��ֱ�����򷨽�������
 * @author Roc-J
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] array = new int[]{23,1,54,65,75,66,78,9,56};
		System.out.println("ԭ������:");
		printArray(array);
		System.out.println("ʹ��ֱ��ѡ�����򷨽�������");
		for (int i = 1; i < array.length; i++) {
			int index = 0;
			for (int j = 1; j < array.length-i; j++) {
				if (array[j]>array[index]) {
					index = j;
				}
			}
			//����
			int temp = array[array.length-i];
			array[array.length-i]=array[index];
			array[index]=temp;
		}
		printArray(array);

	}
	
	/**
	 * ����������ݲ�����
	 * @param array
	 */
	public static void printArray(int[] array){
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
