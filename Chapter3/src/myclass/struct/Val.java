package myclass.struct;

/**
 * 分别定义名称相同的局部变量和全局变量，当名称相同时全局变量将被隐藏。
 * @author Roc-J
 *
 */
public class Val {
	static String Val = "全局变量";
	public static void main(String[] args) {
		String Val = "局部变量";
		System.out.println("在主函数中运行是:"+Val);

	}

}
