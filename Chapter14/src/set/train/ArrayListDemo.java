package set.train;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		for (int i = (int)'a'; i <= (int)'z'; i++) {
			list.add(i);
		}
		
		int i = (int)(Math.random()*(list.size()-1));
		System.out.println("�����ȡ���������: "+i);
		System.out.println("�����ȡ�����е�Ԫ����: "+list.get(i));
		list.remove(i);
		System.out.println("�б�����10�Ķ�����: "+list.get(10));
	}

}
