package myclass.train;

/**
 * 实现输出100以内能被7整除的所有数，使用continue语句过滤其他的数字
 * @author Roc-J
 *
 */
public class ContinueNull {

	public static void main(String[] args) {
		System.out.println("100以内能被7整除的所有数");
		for (int i = 0; i <= 100; i++) {
			if (i%7!=0) {
				continue;
			}
			System.out.print(i+"、");
		}

	}

}
