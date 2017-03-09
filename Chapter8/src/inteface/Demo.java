package inteface;

/**
 * 也可以向上转型到接口，因为实现接口的所有方法
 * @author Roc-J
 *
 */
public class Demo {

	public static void main(String[] args) {
		DrawTest[] graphs = {new Parallelogram(),new Square()};
		for (DrawTest drawTest : graphs) {
			drawTest.draw();
		}
	}

}
