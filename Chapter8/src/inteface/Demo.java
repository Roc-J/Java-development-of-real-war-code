package inteface;

/**
 * Ҳ��������ת�͵��ӿڣ���Ϊʵ�ֽӿڵ����з���
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
