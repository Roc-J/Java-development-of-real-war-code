package object.train;

public class StaticCode {
	static int count;
	static {
		count=0;
		System.out.println("StaticCode类被加载，类属性初始化完毕！");
	}
	
	public StaticCode(){
		count++;
		System.out.println("我是StaticCode类的第"+count+"个对象");
	}
}
