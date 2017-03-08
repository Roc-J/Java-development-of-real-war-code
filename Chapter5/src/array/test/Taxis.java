package array.test;

import java.util.Arrays;

/**
 * 使用Arrays.sort()排序函数
 * @author Roc-J
 *
 */
public class Taxis {

	public static void main(String[] args) {
		int[] arr = new int[]{1,4,2,3,5,8,7,6,9};
		System.out.println("原数组数据元素是: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("排序后数组数据元素是: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
