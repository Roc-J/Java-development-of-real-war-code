package train;

import java.util.Random;

/**
 * Math.random����һ��0-1�����
 * @author Roc-J
 *
 */
public class MathRandomDemo {

	public static void main(String[] args) {
		int s = 2+ (int)(Math.random()*10);
		System.out.println(s);
		
		Random r = new Random();
		System.out.println("ʹ��Random����һ������:"+r.nextInt());
		System.out.println("ʹ��Random����һ��10���ڵ�������"+ r.nextInt(10));
	}		
}
