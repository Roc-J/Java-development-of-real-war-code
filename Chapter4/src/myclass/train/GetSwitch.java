package myclass.train;

/**
 * �жϹ˿Ͷ���Ʒ�ۿ۵ķ�Ӧ������ֱ����ۿ�Ϊ1��2�ۣ�3��4�ۣ�5��6�ۣ�7��8�ۣ��������ۿ�ʱ��������ݡ�
 * @author Roc-J
 *
 */
public class GetSwitch {

	public static void main(String[] args) {
		double reBate = 8;
		switch ((int)reBate) {
		case 1:
		case 2:
			System.out.println("��ô����ô�ã��ѵ����ϵ��ڱ���");
			break;
		case 3:
		case 4:
			System.out.println("�̳���Ҫ������ô");
			break;
		case 5:
		case 6:
			System.out.println("�����ǲ����к��·�������Ҫ������");
			break;
		case 7:
		case 8:
			System.out.println("���̳��ڸ��������");
			break;
		default:
			System.out.println("�Ҿ��ú�ԭ�۲�డ��");
		}

	}

}
