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
			out.writeUTF("��ã�~���ǿͻ���");
			while(true){
				str = in.readUTF();
				out.writeUTF((int)(Math.random()*10)+"");
				System.out.println("�ͻ����յ�: "+str);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
