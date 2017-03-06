package myclass.train;

/**
 * 使用for循环计算100以内（包括100）所有偶数之和
 * @author Roc-J
 *
 */
public class Circulate {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 0; i <= 100; i+=2) {
			sum+=i;
		}
		System.out.println("100以内所有偶数之和是："+sum);
	}

}
