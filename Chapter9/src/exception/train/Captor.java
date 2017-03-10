package exception.train;

public class Captor {
	
	static int quotion(int x,int y) throws MyException{
		if (y<0) {
			throw new MyException("��������Ϊ����");	
		} else {
			return x/y;
		}
	}
	public static void main(String[] args) {
		try {
			int result = quotion(3, -1);
		} catch (MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("��������Ϊ��");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����������Ĵ���");
		}

	}

}
