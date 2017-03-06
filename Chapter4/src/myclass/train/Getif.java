package myclass.train;

/**
 * 如果商品单价低于50，就购买该商品。
 * @author Roc-J
 *
 */
public class Getif {

	public static void main(String[] args) {
		double price = 10.50; //声明单价price
		if (price<50) {
			System.out.println("购买该商品~");
		}
		System.out.println("购买完毕~");
	}

}
