package exception.train;

/**
 * �ڸ����д�������pop()���ڸ÷������׳�NegativeArraySizeException�쳣�����������е��ø÷�������ʵ���쳣����
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
			System.out.println("pop()�����׳����쳣");
		}

	}

}
