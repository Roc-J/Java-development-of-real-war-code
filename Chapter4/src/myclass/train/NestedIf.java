package myclass.train;

/**
 * 根据商品价格以及是否打折、打折多少做出多种判断。
 * @author Roc-J
 *
 */
public class NestedIf {

	public static void main(String[] args) {
		boolean isRebate = true;
		double reBate =8;
		double price = 110.5;
		if (price<50) {
			System.out.println("购买该商品~");
		}else if(isRebate){
			System.out.println("打折的话，我在想想。");
			if(reBate<7.5){
				System.out.println("折扣很不错，我觉得可以购买！");
			}else{
				System.out.println("打折后我也觉得贵，还是放弃购买吧！");
			}
		}else if(price>100){
			System.out.println("太贵了，我不想买这东西~");
		}
		System.out.println("选购完毕~");
	}

}
