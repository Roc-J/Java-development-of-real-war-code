package array.train;

/**
 * 在主方法中创建int型数组，并实现将各月的天数输出
 * @author Roc-J
 *
 */
public class GetDay {

	public static void main(String[] args) {
		int DayMonth[] =  {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < DayMonth.length; i++) {
			System.out.println("第"+(i+1)+"月有"+DayMonth[i]+"天");
		}
	}

}
