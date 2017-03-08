package string.train;

/**
 * 判断俩个字符串是否相等
 * @author Roc-J
 *
 */
public class Opinion {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("ABC");
		String s3 = new String("abc");
		boolean result = s1.equalsIgnoreCase(s2);
		System.out.println(result);
		result = s1.equals(s2);
		System.out.println(result);
		result = (s1==s3);
		System.out.println(result);
	
	}
}
