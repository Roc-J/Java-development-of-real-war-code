package train;

import java.util.Date;

/**
 * 日期的格式化输出
 * @author Roc-J
 *
 */
public class Eval {

	public static void main(String[] args) {
		Date now = new Date();
		String year = String.format("%tY", now);
		String month = String.format("%tB", now);
		String day = String.format("%td", now);
		System.out.println("今年是: " + year + "年" );
		System.out.println("现在是: " + month);
		System.out.println("今天是: " + day+"号");
	}

}
