package array.test;

import java.util.Arrays;

/**
 * ʹ��fill�������
 * @author Roc-J
 *
 */
public class Fill {

	public static void main(String[] args) {
		//��һ�ַ���
		int[] arr = new int[5];
		Arrays.fill(arr, 6);
		System.out.println("��������е�Ԫ�أ� ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		//�ڶ��ַ�Χ���
		Arrays.fill(arr, 1, 4, 8);
		System.out.println("�������������");
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}

}
