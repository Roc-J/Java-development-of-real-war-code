package myclass.train;

/**
 * 分别使用while和do~while语句定义循环
 * @author Roc-J
 *
 */
public class WhilePK {

	public static void main(String[] args) {
		//while
		int number=50;
		while(number<50){
			System.out.println("While循环被执行了");
			number++;
		}
		
		//Do-while循环
		int number2=50;
		do {
			System.out.println("Do-While循环被执行了");
		} while (number2<50);

	}

}
