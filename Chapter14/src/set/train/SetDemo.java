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
		System.out.println("list是可以存放重复元素的,列表内容是: ");
		for (Object object : list) {
			System.out.print(object+" ");
		}
		System.out.println();
		Set set = new HashSet<>();
		set.addAll(list);
		System.out.println("将列表元素加到set集合后，会将重复的元素省去");
		for (Object object : set) {
			System.out.print(object+" ");
		}
	}

}
