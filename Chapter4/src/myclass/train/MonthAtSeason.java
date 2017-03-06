package myclass.train;

/**
 * 使用switch语句判断指定月份属于一年中的哪个季度
 * @author Roc-J
 *
 */
public class MonthAtSeason {

	public static void main(String[] args) {
		int month=3;
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println(month+"月份是冬季~");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month+"月份是春季~");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month+"月份是夏季~");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month+"月份是秋季~");
		default:
			System.out.println("你输入的月份是不正常的~");
			break;
		}

	}

}
