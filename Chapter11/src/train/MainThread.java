package train;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("������������~");
		Thread currentThread = Thread.currentThread();
		System.out.println("�ɹ���ȡ��ǰ���̶߳���");
		String name = currentThread.getName();
		System.out.println("��ǰ�̵߳�������: " + name);
	}

}
