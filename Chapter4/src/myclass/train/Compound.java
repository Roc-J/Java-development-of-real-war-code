package myclass.train;

/**
 * 在主方法中定义复合语句块其中包含另一复合语句块
 * @author Roc-J
 *
 */
public class Compound {

	public static void main(String[] args) {
		int x=20;
		{
			int y=40;
			System.out.println("y="+y);
			int z=255;
			boolean b;
			{
				b = y<z;
				System.out.println("b="+b);
			}
		}
		String word="Hello Flow Control";
		System.out.println(word);

	}

}
