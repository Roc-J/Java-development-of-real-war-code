package myclass.train;

/**
 * ͨ��whileѭ��������1��100��ӣ�������������
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
		System.out.println("100��������������: " + sum);
	}

}
