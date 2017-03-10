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
				System.out.println(getName()+":检查票数大于0");
				System.out.println(getName()+":\t正在收款(大约5秒后完成)...");
				try {
					Thread.sleep(5000);
					System.out.println(getName()+":\t打印票据，售票完成...");
					num--;
					printNumInfo();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("没有票了，不能进行售票");
			}
		}
		
	}
	
	public void printNumInfo(){
		System.out.println("系统:当前剩余票数:"+num);
		if (num<0) {
			System.out.println("警告: 票数低于0,出现负数");
		}
		
	}

	public static void main(String[] args) {
		try {
			new ThreadSafeTest("售票员李某").start();
			Thread.sleep(2000);
			new ThreadSafeTest("售票员张萌萌").start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
