package array.test;

import java.util.Arrays;

/**
 * ��������
 * @author Roc-J
 *
 */
public class Cope {

	public static void main(String[] args) {
		int[] arr = new int[]{12,34,23,56,6,88,90};
		System.out.println("ԭ��������Ԫ����: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		int[] newarr = Arrays.copyOf(arr, 5);
		System.out.println("����ǰ5������Ԫ����: ");
		for (int i : newarr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int[] newarrcopy = Arrays.copyOfRange(arr, 1, 6);
		System.out.println("����1��6������Ԫ����: ");
		for (int i : newarrcopy) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

