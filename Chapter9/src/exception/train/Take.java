package exception.train;

/**
 * 使用try-catch语句将可能发生的异常语句进行异常处理
 * @author Roc-J
 *
 */
public class Take {

	public static void main(String[] args) {
		try {
			String str = "lili";
			System.out.println(str+"的年龄是:");
			int age = Integer.parseInt("20L");
			System.out.println(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("程序结束");
	}

}
