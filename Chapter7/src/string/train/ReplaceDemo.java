package string.train;

/**
 * 替换函数replace
 * @author Roc-J
 *
 */
public class ReplaceDemo {

	public static void main(String[] args) {
		String str = "Hi~you are learing java";
		String nstr = str.replace("a", "A");
		System.out.println("原字符串是"+str);
		System.out.println("使用A替换原字符串a，结果是:"+nstr);
	}

}
