package myclass.train;

/**
 * ʹ��whileѭ�����100�������������ĺ�
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
		System.out.println("100����������������: " +sum);

	}

}
