package train;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamOutDemo {

	public static void main(String[] args) {
		OutputStream out = System.out;
		try {
			byte[] bs = "这个是在程序中写的一个字符串~可以放在输出台\n".getBytes();
			out.write(bs);
			bs = "输出内容：\n".getBytes();
			out.write(bs);
			bs = "哈哈哈，说的有道理".getBytes();
			out.write(bs);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
