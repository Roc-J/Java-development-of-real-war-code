package train;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		String str = null;
		DataOutputStream dos = null;
		DataInputStream in = null;
		try {
			serverSocket = new ServerSocket(8888);
			clientSocket = serverSocket.accept();
			in = new DataInputStream(clientSocket.getInputStream());
			dos = new DataOutputStream(clientSocket.getOutputStream());
			while(true){
				str = in.readUTF();
				dos.writeUTF("Hello,我是服务器~");
				dos.writeUTF(str);
				System.out.println("服务器收到的是: " +str);
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
