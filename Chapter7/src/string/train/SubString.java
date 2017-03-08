package string.train;

/**
 * 字符串的 截取
 * @author Roc-J
 *
 */
public class SubString {

	public static void main(String[] args) {
		String source = "Hi~nice to meet you~";
		System.out.println("原字符串是:"+source);
		String subString = source.substring(3);
		System.out.println("从索引3位置截取"+source+"后得到"+subString);
		String substr = source.substring(3, 8);
		System.out.println("从索引3到8截取"+source+"后得到"+substr);
	}

}
