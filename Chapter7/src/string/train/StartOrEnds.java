package string.train;

/**
 * 字符串的开头或结尾
 * @author Roc-J
 *
 */
public class StartOrEnds {

	public static void main(String[] args) {
		String str1 = "1212234566";
		String str2 = "3467678956";
		System.out.println("字符串"+str1+"是以12开头的么？"+str1.startsWith("12"));
		System.out.println("字符串"+str1+"是以56结尾的么？"+str1.endsWith("56"));
		System.out.println("字符串"+str2+"是以12开头的么？"+str1.startsWith("12"));
		System.out.println("字符串"+str2+"是以56结尾的么？"+str1.endsWith("56"));
	}

}
