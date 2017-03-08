package object.train;

public class StaticDemo {
	
	static {
		System.out.println("StaticDemo类被加载，我是主类。");
	}
	public static void main(String[] args) {
		System.out.println("主方法被执行");
		StaticCode codeblock1 = new StaticCode();
		StaticCode codeblock2 = new StaticCode();
		StaticCode codeblock3 = new StaticCode();
		
	}

}
