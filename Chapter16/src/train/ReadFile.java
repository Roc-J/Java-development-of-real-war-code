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
			System.out.println("文件名称:" + name);
			System.out.println("文件父路径： " + ppath);
			System.out.println("文件大小: "+ length);
			System.out.println("是否为可改写文件: "+isChange);
		}

	}

}
