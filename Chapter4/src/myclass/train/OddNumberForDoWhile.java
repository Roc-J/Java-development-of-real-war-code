package myclass.train;

/**
 * 使用Do-while循环求100以内所有的奇数的和
 * @author Roc-J
 *
 */
public class OddNumberForDoWhile {

	public static void main(String[] args) {
		int sum=0;
		int number=1;
		do {
			sum+=number;
			number+=2;
		} while (number<=100);
		System.out.println("100以内所有奇数的和是: " + sum);
	}

}
