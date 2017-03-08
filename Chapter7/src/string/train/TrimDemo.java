package string.train;

public class TrimDemo {

	public static void main(String[] args) {
		String str = "  Hi~how are you        ";
		System.out.println("原字符串是"+str+",长度是"+str.length());
		String nstr = str.trim();
		System.out.println("去掉左右的空格后，字符串是"+nstr+",长度是"+ nstr.length());

	}

}
