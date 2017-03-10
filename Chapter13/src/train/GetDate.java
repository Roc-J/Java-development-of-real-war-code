package train;

import java.util.Date;

/**
 * 将日期格式化，表示成00时00分00秒
 * @author Roc-J
 *
 */
public class GetDate {

	public static void main(String[] args) {
		Date now = new Date();
		String hour = String.format("%tH", now);
		String Minutes = String.format("%tM", now);
		String Second = String.format("%tS", now);
		System.out.println("现在是"+hour+"时"+Minutes+"分"+Second+"秒");

	}

}
