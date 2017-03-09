package classdemo.train;

public class MulDemo {

	public static void main(String[] args) {
		Quadrangle[] graph = new Quadrangle[3];
		graph[0] = new Square();
		graph[1] = new Parallelogram();
		graph[2] = new Rectangle();
		for (Quadrangle quadrangle : graph) {
			quadrangle.draw();
		}
	}

}
