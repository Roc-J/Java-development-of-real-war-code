package train;

public class Writer extends Thread {

	@Override
	public void run() {
		while(true){
			System.out.println(name+ ":дһ���ĸ�");
			System.out.println(name+":˼��һ�£�������û�к�˼·��");
			try {
				Thread.sleep((int)(Math.random()*10000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private String name = "δ֪";
	public Writer(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		Thread writer1 = new Writer("����1");
		Thread writer2 = new Writer("\t����2");
		writer1.start();
		writer2.start();
	}

}
