package exception.test;

/**
 * ʹ��һ�������ഫ�ݲ����������ܳ�
 * @author Roc-J
 *
 */
public class PerimeterDemo {

	public static void main(String[] args) {
		PerimeterDemo demo = new PerimeterDemo();
		int perimeter = demo.computePerimeter(new IRectangle(){
			public int getWidth(){
				return 1;
			}
			public int getHeight(){
				return 1;
			}
		});
		System.out.println("����������ܳ���: "+perimeter);
	}
	
	public int computePerimeter(IRectangle rectangle){
		int width = rectangle.getWidth();
		int height = rectangle.getHeight();
		int perimeter = 2*(width+height);
		return perimeter;
	}

}
