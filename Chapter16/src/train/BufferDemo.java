package train;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferDemo {

	public static void main(String[] args) {
		try {
			File file = new File("F://Github//Java-development-of-real-war-code//Chapter16//src//train//test.txt");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int count = 0;
			bis.mark(50);
			for (int i = 0; i < 10; i++) {
				count++;
				int read = bis.read();
				if (count%5==0) {
					bis.reset();
				}
				System.out.print((char)read);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
