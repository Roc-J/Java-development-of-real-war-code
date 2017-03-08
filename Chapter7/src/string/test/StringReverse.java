package string.test;

/**
 * 字符串翻转
 * @author Roc-J
 *
 */
public class StringReverse {
	static String text = "该字符串用来测试翻转";
	public static void main(String[] args) {
		System.out.println("原字符串是:"+text);
		//使用split
		String[] arrays = text.split("");
		System.out.print("用split来实现翻转："+"\t");
		for (int i = arrays.length-1; i>=0; i--) {
			System.out.print(arrays[i]);
		}
		System.out.println();
		//使用charAt
		int length = text.length()-1;
		System.out.print("用charAt来实现翻转："+"\t");
		while(length>=0){
			System.out.print(text.charAt(length));
			length = length-1;
		}
	}

}
