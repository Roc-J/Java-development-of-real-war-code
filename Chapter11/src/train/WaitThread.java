package train;

public class WaitThread implements Runnable {

	boolean running = true;	
	
	@Override
	public void run() {
		int count = 0;
		while(running){
			try {
				Thread.sleep(1000);
				count = ++count;
				System.out.println(count);
				if (count==6) {
					running = false;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		WaitThread demo = new WaitThread();
		Thread t = new Thread(demo);
		t.setName("Ïß³Ì1");
		t.start();

	}

}
