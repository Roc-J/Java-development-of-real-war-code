package string.test;

/**
 * 变量搜索，使用indexOf()
 * @author Roc-J
 *
 */
public class SearchString {
	public final static String text = "成员变量是在类体中定义的变量"
			+ "即全局变量，成员变量用于定义对象的状态。";
	
	public static void main(String[] args) {
		String str = "变量";
		int res = 0;
		while(res!=-1){
			res = text.indexOf(str, res+1);
			if(res>=0){
				System.out.println("变量在字符串text索引位置为"+res+"处");
			}				
		}
	}
}
