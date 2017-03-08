package string.train;

/**
 * 查找字符a在字符串中的索引位置
 * @author Roc-J
 *
 */
public class StringIndexOf {

	public static void main(String[] args) {
		String str = "We are studnets";
		int index = str.indexOf("a");
		System.out.println("a在字符串"+str+"中的索引位置是:"+index);
		int lastindex = str.lastIndexOf("s");
		System.out.println("s在字符串中最后索引位置是: "+ lastindex);
		System.out.println("字符串"+str+"的长度是"+str.length());
	}

}
