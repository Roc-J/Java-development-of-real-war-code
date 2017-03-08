package string.train;

/**
 * 字符串的分割split()
 * @author Roc-J
 *
 */
public class Division {

	public static void main(String[] args) {
		String str = "china,english,american,Indien";
		System.out.println("原字符串：");
		System.out.println(str);
		System.out.println("以逗号分割后:");
		String[] countries = str.split(",");
		for (String string : countries) {
			System.out.println(string);
		}
		String[] splitItems = str.split(",", 2);
		System.out.println("只允许分割2次，结果是");
		for (String string : splitItems) {
			System.out.println(string);
		}
	}

}
