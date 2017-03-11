package train;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		String str = null;
		Socket clientSocket;
		DataInputStream in=null;
		DataOutputStream out = null;
		try {
			clientSocket = new Socket("127.0.0.1", 8888);
			in = new DataInputStream(clientSocket.getInputStream());
			out = new DataOutputStream(clientSocket.getOutputStream());
			out.writeUTF("你好！~我是客户端");
			while(true){
				str = in.readUTF();
				out.writeUTF((int)(Math.random()*10)+"");
				System.out.println("客户端收到: "+str);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
