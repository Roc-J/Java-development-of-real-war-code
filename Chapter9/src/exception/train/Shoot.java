package exception.train;

/**
 * 在该类中创建方法pop()，在该方法中抛出NegativeArraySizeException异常，在主方法中调用该方法，并实现异常处理。
 * @author Roc-J
 *
 */
public class Shoot {
	/**
	 * 
	 * @throws NegativeArraySizeException
	 */
	static void pop() throws NegativeArraySizeException{
		int[] arr = new int[-3];
	}
	public static void main(String[] args) {
		try {
			pop();
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
			System.out.println("pop()方法抛出的异常");
		}

	}

}
