package array.test;

import java.util.Arrays;

/**
 * 复制数组
 * @author Roc-J
 *
 */
public class Cope {

	public static void main(String[] args) {
		int[] arr = new int[]{12,34,23,56,6,88,90};
		System.out.println("原数组数据元素是: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		int[] newarr = Arrays.copyOf(arr, 5);
		System.out.println("复制前5个数据元素是: ");
		for (int i : newarr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int[] newarrcopy = Arrays.copyOfRange(arr, 1, 6);
		System.out.println("复制1到6个数据元素是: ");
		for (int i : newarrcopy) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

