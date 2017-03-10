package train;

import java.util.Random;

/**
 * Math.random产生一个0-1随机数
 * @author Roc-J
 *
 */
public class MathRandomDemo {

	public static void main(String[] args) {
		int s = 2+ (int)(Math.random()*10);
		System.out.println(s);
		
		Random r = new Random();
		System.out.println("使用Random产生一个整数:"+r.nextInt());
		System.out.println("使用Random产生一个10以内的整数："+ r.nextInt(10));
	}		
}
