package array.test;

import java.util.Arrays;

/**
 * ʹ��Arrays.sort()������
 * @author Roc-J
 *
 */
public class Taxis {

	public static void main(String[] args) {
		int[] arr = new int[]{1,4,2,3,5,8,7,6,9};
		System.out.println("ԭ��������Ԫ����: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("�������������Ԫ����: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
