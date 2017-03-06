package myclass.test;

/**
 * 计算N阶乘（0-17）
 * @author Roc-J
 *
 */
public class Factorial {

	public static void main(String[] args) {
		int n = 16;
		long result=1;
		if(n<0 || n>17){
			System.out.println("n的取值范围是0到17，大于17超过long的范围。");
		}
		else if(n==0){
			System.out.println("0的阶乘等于1");
		}
		else{
			for (int i = n; i>=1; i--) {
				result *=i;
			}
			System.out.println(n+"的阶乘是"+ result );
		}
	}

}
