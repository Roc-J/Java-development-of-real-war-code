package myclass.train;

/**
 * ʹ��switch����ж�ָ���·�����һ���е��ĸ�����
 * @author Roc-J
 *
 */
public class MonthAtSeason {

	public static void main(String[] args) {
		int month=3;
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println(month+"�·��Ƕ���~");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month+"�·��Ǵ���~");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month+"�·����ļ�~");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month+"�·����＾~");
		default:
			System.out.println("��������·��ǲ�������~");
			break;
		}

	}

}
