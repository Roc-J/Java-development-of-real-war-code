package myclass.train;

/**
 * 根据商品价格以及是否打折，做出多种判断
 * @author Roc-J
 *
 */
public class GetTerm {

	public static void main(String[] args) {
		double price = 110.5;
		boolean isRebate = true;
		if (price<50) {
			System.out.println("购买该商品！");
		} else if(isRebate){
			System.out.println("既然打折，那我觉得可以购买！");
		} else if(price>100)
			System.out.println("太贵了，我还是不买了吧！");
		System.out.println("购买完毕~");
	}

}
