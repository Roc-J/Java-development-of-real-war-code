package myclass.train;

/**
 * 通过while循环将整数1到100相加，并将结果输出。
 * @author Roc-J
 *
 */
public class GetSum {

	public static void main(String[] args) {
		int sum=0;
		int number=1;
		while(number<=100){
			sum+=number;
			number++;
		}
		System.out.println("100以内所有数等于: " + sum);
	}

}
