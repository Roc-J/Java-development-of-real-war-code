package array.test;

/**
 * ʹ��ð������
 * @author Roc-J
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[]{4,23,56,2,35,7,89};
		System.out.println("ԭ������:");
		print(arr);
		
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if (arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("ð�������������:");
		print(arr);

	}
	
	public static void print(int[] array){
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
