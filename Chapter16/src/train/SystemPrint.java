package train;

import java.io.IOException;
import java.io.InputStream;

/**
 * ����InputStream�����丳ֵΪSystem.in
 * @author Roc-J
 *
 */
public class SystemPrint {

	public static void main(String[] args) {
		InputStream is = System.in;
		try {
			byte[] by = new byte[1024];
			int len = is.read(by);
			System.out.println("����̨���������: "+ new String(by).trim());
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
