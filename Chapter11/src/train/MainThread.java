package train;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("主方法在运行~");
		Thread currentThread = Thread.currentThread();
		System.out.println("成功获取当前的线程对象");
		String name = currentThread.getName();
		System.out.println("当前线程的名称是: " + name);
	}

}
