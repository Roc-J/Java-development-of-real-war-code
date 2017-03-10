package train;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		long tmills = System.currentTimeMillis()+5000;
		Date other = new Date(tmills);
		if (other.after(now)) {
			System.out.println("other对象表示的时间是在now对象表示的时间之后...");
		} else {
			System.out.println("other对象表示的时间是在now对象表示的时间之前...");
		}

	}

}
