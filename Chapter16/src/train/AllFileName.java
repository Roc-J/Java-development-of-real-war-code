package train;

import java.io.File;
/**
 * �����ļ��µ������ļ���ʾ����
 * @author Roc-J
 *
 */
public class AllFileName {

	public static void main(String[] args) {
		File dir = new File("F://Github//Java-development-of-real-war-code//Chapter16//src//train");
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File file : files) {
				System.out.println(file.getAbsolutePath());
			}
		}
	}
}
