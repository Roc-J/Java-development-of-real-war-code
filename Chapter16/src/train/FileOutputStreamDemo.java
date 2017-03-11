package train;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try {
			File file = new File("F://Github//Java-development-of-real-war-code//Chapter16//src//train//test.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(file);
			byte[] bytes = "java 开发指南...".getBytes();
			fos.write(bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
