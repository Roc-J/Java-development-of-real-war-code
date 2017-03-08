package classdemo.train;

/**
 * 定义car类，定义颜色，速度，档位
 * @author Roc-J
 *
 */
public class Car {
	public String color = "红色";
	public int speed = 1;
	public int level = 1;
	
	public void gear(int level){
		this.level = level;
		speed = level *10;
	}
	
	public void drive(){
		System.out.println("我是一辆"+color+"的汽车");
		System.out.println("我以时速"+speed+"行驶");
		System.out.println("我的档位是"+level);
	}
}
