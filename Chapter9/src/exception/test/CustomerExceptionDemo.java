package exception.test;

/**
 * 计算商品的总价，返回sum
 * @author Roc-J
 *
 */
public class CustomerExceptionDemo {

	private double sum;
	
	public double computePrice(double price) throws NumberValueException{
		if (price<0) {
			throw new NumberValueException(price);
		} else {
			sum +=price;
		}
		return sum;
	}
	
	public double getSum(){
		return sum;

	}
	public static void main(String[] args) {
		CustomerExceptionDemo demo = new CustomerExceptionDemo();
		double priceSum = 0;
		try {
			priceSum = demo.computePrice(5.1);
			priceSum = demo.computePrice(-3);
		} catch (NumberValueException e) {
			e.printStackTrace();
			System.out.println("单价"+e.getPrice()+"非法，请核对后，重新输入");
		}
		System.out.println("商品单价的总和是: " + priceSum);
	}

}
