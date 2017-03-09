package classdemo.train;

public class MouseDemo {

	public static void main(String[] args) {
		Master master = new Master();
		WhiteMouse wmouse = new WhiteMouse();
		GrayMouse gmouse = new GrayMouse();
		MottleMouse mmouse = new MottleMouse();
		System.out.println("ÊÔ¾Æ¿ªÊ¼....");
		master.feedMouse(wmouse);
		master.feedMouse(gmouse);
		master.feedMouse(mmouse);

	}

}
