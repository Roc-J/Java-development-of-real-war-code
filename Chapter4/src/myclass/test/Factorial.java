package myclass.test;

/**
 * ����N�׳ˣ�0-17��
 * @author Roc-J
 *
 */
public class Factorial {

	public static void main(String[] args) {
		int n = 16;
		long result=1;
		if(n<0 || n>17){
			System.out.println("n��ȡֵ��Χ��0��17������17����long�ķ�Χ��");
		}
		else if(n==0){
			System.out.println("0�Ľ׳˵���1");
		}
		else{
			for (int i = n; i>=1; i--) {
				result *=i;
			}
			System.out.println(n+"�Ľ׳���"+ result );
		}
	}

}
