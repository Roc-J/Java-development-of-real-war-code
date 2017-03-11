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
		System.out.println("随机获取的随机数是: "+i);
		System.out.println("随机获取集合中的元素是: "+list.get(i));
		list.remove(i);
		System.out.println("列表索引10的对象是: "+list.get(10));
	}

}
