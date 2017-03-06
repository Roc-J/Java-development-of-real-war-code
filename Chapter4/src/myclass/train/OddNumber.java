package myclass.train;

/**
 * 使用while循环求出100以内所有奇数的和
 * @author Roc-J
 *
 */
public class OddNumber {

	public static void main(String[] args) {
		int sum=0;
		int number=1;
		while(number<=100){
			if(number%2==1){
				sum+=number;
			}
			number++;
		}
		System.out.println("100以内所有奇数和是: " +sum);

	}

}
