package myclass.test;

/**
 * 从1开始查找素数，输出40个素数，每行10个
 * @author Roc-J
 *
 */
public class PrimeNumber {
	public static void main(String[] args) {
		final int NUMBER_FOR_PRIME = 40;
		final int NUMBER_FOR_EACH_LINE = 10;
		int count=0;
		int number=2;
		while(count<NUMBER_FOR_PRIME){
			boolean isflag=true;
			for(int i=2;i<=number/2;i++){
				if(number%i==0){
					isflag=false;
					break;
				}
			}
			if(isflag){
				count++;
				System.out.print(number+"\t");
				if (count%NUMBER_FOR_EACH_LINE==0) {
					System.out.println();
				}
			}
			number++;
		}
	}
}
