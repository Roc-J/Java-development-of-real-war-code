package exception.test;

/**
 * ������Ʒ���ܼۣ�����sum
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
			System.out.println("����"+e.getPrice()+"�Ƿ�����˶Ժ���������");
		}
		System.out.println("��Ʒ���۵��ܺ���: " + priceSum);
	}

}
