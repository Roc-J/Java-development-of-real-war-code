package train;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamOutDemo {

	public static void main(String[] args) {
		OutputStream out = System.out;
		try {
			byte[] bs = "������ڳ�����д��һ���ַ���~���Է������̨\n".getBytes();
			out.write(bs);
			bs = "������ݣ�\n".getBytes();
			out.write(bs);
			bs = "��������˵���е���".getBytes();
			out.write(bs);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
