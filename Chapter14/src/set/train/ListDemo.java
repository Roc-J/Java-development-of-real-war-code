package set.train;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String a="A",b="B",c="C",apple="Apple";
		list.add(apple);
		list.add(a);
		list.add(apple);
		list.add(b);
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(apple));
		System.out.println(list.lastIndexOf(apple));

	}

}
