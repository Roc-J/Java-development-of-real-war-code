package train;

import java.io.IOException;
import java.io.InputStream;

/**
 * 创建InputStream，将其赋值为System.in
 * @author Roc-J
 *
 */
public class SystemPrint {

	public static void main(String[] args) {
		InputStream is = System.in;
		try {
			byte[] by = new byte[1024];
			int len = is.read(by);
			System.out.println("控制台输入的内容: "+ new String(by).trim());
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
