package train;

import java.io.File;

public class ReadFile {

	public static void main(String[] args) {
		File file = new File("F://Github//Java-development-of-real-war-code//Chapter16//src//train//test.txt");
		if (file.exists()) {
			String name = file.getName();
			String ppath = file.getParent();
			long length = file.length();
			boolean isChange = file.canWrite();
			System.out.println("�ļ�����:" + name);
			System.out.println("�ļ���·���� " + ppath);
			System.out.println("�ļ���С: "+ length);
			System.out.println("�Ƿ�Ϊ�ɸ�д�ļ�: "+isChange);
		}

	}

}
