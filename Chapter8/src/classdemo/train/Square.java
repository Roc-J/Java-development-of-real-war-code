package classdemo.train;

/**
 * 正方形
 * @author Roc-J
 *
 */
public class Square extends Quadrangle {

	/**
	 * 正方形的绘制图像
	 */
	@Override
	public void draw() {
		System.out.println("------------");
		System.out.println("|          |");
		System.out.println("|          |");
		System.out.println("|   正方形   |");
		System.out.println("|          |");
		System.out.println("|          |");
		System.out.println("------------");
	}
	
}
