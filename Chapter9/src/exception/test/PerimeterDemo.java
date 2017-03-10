package exception.test;

/**
 * 使用一个匿名类传递参数来计算周长
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
		System.out.println("匿名矩阵的周长是: "+perimeter);
	}
	
	public int computePerimeter(IRectangle rectangle){
		int width = rectangle.getWidth();
		int height = rectangle.getHeight();
		int perimeter = 2*(width+height);
		return perimeter;
	}

}
