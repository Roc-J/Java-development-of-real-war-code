package array.test;

import java.util.Arrays;

/**
 * 使用fill填充数组
 * @author Roc-J
 *
 */
public class Fill {

	public static void main(String[] args) {
		//第一种方法
		int[] arr = new int[5];
		Arrays.fill(arr, 6);
		System.out.println("输出数组中的元素： ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		//第二种范围填充
		Arrays.fill(arr, 1, 4, 8);
		System.out.println("填充数组后输出：");
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}

}
