package classdemo.train;

public class MouseDemo {

	public static void main(String[] args) {
		Master master = new Master();
		WhiteMouse wmouse = new WhiteMouse();
		GrayMouse gmouse = new GrayMouse();
		MottleMouse mmouse = new MottleMouse();
		System.out.println("�Ծƿ�ʼ....");
		master.feedMouse(wmouse);
		master.feedMouse(gmouse);
		master.feedMouse(mmouse);

	}

}
