package classdemo.train;

/**
 * ����car�࣬������ɫ���ٶȣ���λ
 * @author Roc-J
 *
 */
public class Car {
	public String color = "��ɫ";
	public int speed = 1;
	public int level = 1;
	
	public void gear(int level){
		this.level = level;
		speed = level *10;
	}
	
	public void drive(){
		System.out.println("����һ��"+color+"������");
		System.out.println("����ʱ��"+speed+"��ʻ");
		System.out.println("�ҵĵ�λ��"+level);
	}
}
