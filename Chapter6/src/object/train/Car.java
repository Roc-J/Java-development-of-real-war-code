package object.train;

/**
 * ����һ��car��
 * @author Roc-J
 *
 */
public class Car {
	//��ɫ
	public String color="��ɫ";
	//�ٶ�
	public int speed = 1;
	//��λ
	public int level;
	
	/**
	 * ��������
	 * @param number
	 */
	public void gear(int number){
		level = number;
		speed = level*10;
	}
	
	public void drive(){
		System.out.println("����һ��"+color+"��������");
		System.out.println("ʱ����:"+speed);
	}

}
