package object.train;

/**
 * 创建一个car类
 * @author Roc-J
 *
 */
public class Car {
	//颜色
	public String color="黑色";
	//速度
	public int speed = 1;
	//档位
	public int level;
	
	/**
	 * 换挡方法
	 * @param number
	 */
	public void gear(int number){
		level = number;
		speed = level*10;
	}
	
	public void drive(){
		System.out.println("这是一辆"+color+"的汽车。");
		System.out.println("时速是:"+speed);
	}

}
