package train;

public class ThreadSafeTest extends Thread {
	private static Integer num =1;
	
	public ThreadSafeTest(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		synchronized (num) {
			if(num>0){
				System.out.println(getName()+":���Ʊ������0");
				System.out.println(getName()+":\t�����տ�(��Լ5������)...");
				try {
					Thread.sleep(5000);
					System.out.println(getName()+":\t��ӡƱ�ݣ���Ʊ���...");
					num--;
					printNumInfo();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("û��Ʊ�ˣ����ܽ�����Ʊ");
			}
		}
		
	}
	
	public void printNumInfo(){
		System.out.println("ϵͳ:��ǰʣ��Ʊ��:"+num);
		if (num<0) {
			System.out.println("����: Ʊ������0,���ָ���");
		}
		
	}

	public static void main(String[] args) {
		try {
			new ThreadSafeTest("��ƱԱ��ĳ").start();
			Thread.sleep(2000);
			new ThreadSafeTest("��ƱԱ������").start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
