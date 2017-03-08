package string.train;

/**
 * 使用compareTo()方法对字符串进行比较
 * @author Roc-J
 *
 */
public class Wordbook {

	public static void main(String[] args) {
		String str = "a";
		String str2 = "b";
		String str3 = "c";
		System.out.println(str+" CompareTo "+str2+",结果是:"+ str.compareTo(str2));
		System.out.println(str3+" CompareTo "+str2+",结果是:"+ str3.compareTo(str2));
	}

}
