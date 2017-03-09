package train;

public class Writer extends Thread {

	@Override
	public void run() {
		while(true){
			System.out.println(name+ ":写一段文稿");
			System.out.println(name+":思考一下，看看有没有好思路。");
			try {
				Thread.sleep((int)(Math.random()*10000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private String name = "未知";
	public Writer(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		Thread writer1 = new Writer("作者1");
		Thread writer2 = new Writer("\t作者2");
		writer1.start();
		writer2.start();
	}

}
