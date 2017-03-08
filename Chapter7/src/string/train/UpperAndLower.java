package string.train;

/**
 * 字符串的大写小写转换
 * @author Roc-J
 *
 */
public class UpperAndLower {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "hello java";
		System.out.println("原字符串str1:" +str1);
		System.out.println("原字符串str2:" +str2);
		System.out.println("=================");
		System.out.println("分别转换小写：");
		System.out.println("str1 toLowerCase():"+str1.toLowerCase());
		System.out.println("str2 toLowerCase():"+str2.toLowerCase());
		System.out.println("=================");
		System.out.println("str1 equals str2?"+str1.equals(str2));
		System.out.println("忽略大小写后:");
		System.out.println("str1 equals str2?"+str1.toUpperCase().equals(str2.toUpperCase()));
	}

}
