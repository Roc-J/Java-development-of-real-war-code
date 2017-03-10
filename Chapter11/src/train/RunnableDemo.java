package train;

public class RunnableDemo implements Runnable {
	private String text = "在讲到接口时提到了通过接口可以实现多重继承的目的。";
	
	@Override
	public void run() {
		String[] texts = text.split("");
		for (String string : texts) {
			System.out.print(string);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		RunnableDemo demo = new RunnableDemo();
		Thread thread = new Thread(demo);
		thread.start();

	}

}
