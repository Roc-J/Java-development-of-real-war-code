package train;

import java.util.Date;

public class DateCompare {

	public static void main(String[] args) {
		Date now = new Date();
		long tmills = System.currentTimeMillis()-1000;
		Date other = new Date(tmills);
		int compare = now.compareTo(other);
		switch(compare){
		case 0:
			System.out.println("两个日期对象表示的时间相等.");
		    break;
		case 1:
			System.out.println("now对象表示的时间大于other对象表示的时间.");
			break;
		case -1:
			System.out.println("now对象表示的时间小于other对象表示的时间");
			break;
		default:
			System.out.println(compare);
			break;
		}

	}

}
