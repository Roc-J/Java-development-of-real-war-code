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
	 * ����
	 * @return
	 */
	@Override
	public String getMessage() {
		String message = "��Ʒ�ļ۸���Ϊ����~";
		return message;
	}

}
