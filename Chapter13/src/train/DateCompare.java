package train;

import java.util.Date;

public class DateCompare {

	public static void main(String[] args) {
		Date now = new Date();
		long tmills = System.currentTimeMillis()-1000;
		Date other = new Date(tmills);
		int compare = now.compareTo(other);
		switch(compare){
		case 0:
			System.out.println("�������ڶ����ʾ��ʱ�����.");
		    break;
		case 1:
			System.out.println("now�����ʾ��ʱ�����other�����ʾ��ʱ��.");
			break;
		case -1:
			System.out.println("now�����ʾ��ʱ��С��other�����ʾ��ʱ��");
			break;
		default:
			System.out.println(compare);
			break;
		}

	}

}
