package train;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * File->FileInputStream
 * @author Roc-J
 *
 */
public class FileInputStreamDemo {

	public static void main(String[] args) {
		File file = new File("F://Github//Java-development-of-real-war-code//Chapter16//src//train//test.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			int length ;
			byte[] bs = new byte[1024];
			while((length=fis.read(bs))!=-1){
				String str = new String(bs,0,length);
				System.out.println("从文件中读取的数据是: " +str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
