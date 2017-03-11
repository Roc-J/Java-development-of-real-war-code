package train;

import java.net.InetAddress;

public class LocalHostDemo {

	public static void main(String[] args) {
		InetAddress ip;
		try {
			ip = InetAddress.getLocalHost();
			System.out.println(ip);
			String name = ip.getHostName();
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
