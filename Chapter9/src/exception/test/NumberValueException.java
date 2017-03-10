package exception.test;

public class NumberValueException extends Exception{
	
	private double price;
	
	public NumberValueException(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
	
	/**
	 * 覆盖
	 * @return
	 */
	@Override
	public String getMessage() {
		String message = "商品的价格不能为负数~";
		return message;
	}

}
