package classdemo.train;

/**
 * instanceOfʵ���ж�
 * @author Roc-J
 *
 */
public class Demo {

	public static void main(String[] args) {
		Quadrangle quaobj = new Quadrangle();
		Square sqobj = new Square();
		Parallelogram paraobj = new Parallelogram();
		Anything anyobj = new Anything();
		System.out.println("�ж�Quadrangle��Ķ���quaobj");
		verinstance(quaobj);
		System.out.println("�ж�Square��Ķ���sqobj");
		verinstance(sqobj);
		System.out.println("�ж�Parallelogram��Ķ���paraobj");
		verinstance(paraobj);
		System.out.println("�ж�Anything��Ķ���anyobj");
		verinstance(anyobj);

	}
	
	private static void verinstance(Object obj){
		if(obj instanceof Quadrangle){
			System.out.println("\t�ö�����Quadrangle���ʵ������");
		}
		if(obj instanceof Square){
			System.out.println("\t�ö�����Square���ʵ������");
		}
		if(obj instanceof Parallelogram){
			System.out.println("\t�ö�����Parallelogram���ʵ������");
		}
		if(obj instanceof Anything){
			System.out.println("\t�ö�����Anything���ʵ������");
		}
		System.out.println("================================");
	}

}
