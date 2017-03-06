package myclass.train;

/**
 * 根据商品单价，判断是否购买。
 * @author Roc-J
 *
 */
public class Getifelse {

	public static void main(String[] args) {
		double price = 110.45;
		if (price<50) {
			System.out.println("购买该商品!");
		} else {
			System.out.println("太贵了，我需要考虑一下~");
		}
		System.out.println("购买完毕！");
	}

}
