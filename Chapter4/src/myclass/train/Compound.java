package myclass.train;

/**
 * ���������ж��帴���������а�����һ��������
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
