package set.train;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		System.out.println("list�ǿ��Դ���ظ�Ԫ�ص�,�б�������: ");
		for (Object object : list) {
			System.out.print(object+" ");
		}
		System.out.println();
		Set set = new HashSet<>();
		set.addAll(list);
		System.out.println("���б�Ԫ�ؼӵ�set���Ϻ󣬻Ὣ�ظ���Ԫ��ʡȥ");
		for (Object object : set) {
			System.out.print(object+" ");
		}
	}

}
