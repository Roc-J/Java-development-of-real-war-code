package classdemo.train;

/**
 * instanceOf实例判断
 * @author Roc-J
 *
 */
public class Demo {

	public static void main(String[] args) {
		Quadrangle quaobj = new Quadrangle();
		Square sqobj = new Square();
		Parallelogram paraobj = new Parallelogram();
		Anything anyobj = new Anything();
		System.out.println("判断Quadrangle类的对象quaobj");
		verinstance(quaobj);
		System.out.println("判断Square类的对象sqobj");
		verinstance(sqobj);
		System.out.println("判断Parallelogram类的对象paraobj");
		verinstance(paraobj);
		System.out.println("判断Anything类的对象anyobj");
		verinstance(anyobj);

	}
	
	private static void verinstance(Object obj){
		if(obj instanceof Quadrangle){
			System.out.println("\t该对象是Quadrangle类的实例对象。");
		}
		if(obj instanceof Square){
			System.out.println("\t该对象是Square类的实例对象。");
		}
		if(obj instanceof Parallelogram){
			System.out.println("\t该对象是Parallelogram类的实例对象。");
		}
		if(obj instanceof Anything){
			System.out.println("\t该对象是Anything类的实例对象。");
		}
		System.out.println("================================");
	}

}
