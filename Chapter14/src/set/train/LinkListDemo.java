package set.train;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 演示LinkList使用
 * @author Roc-J
 *
 */
public class LinkListDemo {

	public static void main(String[] args) {
		String a = "A",b="B",c="C",d="D",e="E";
		List<String> list = new LinkedList<String>();
		list.add(a);
		list.add(e);
		list.add(d);
		Iterator<String> it = list.iterator();
		System.out.println("输出list中的元素");
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();
		list.set(1, b);
		list.add(2, c);
		Iterator<String> itra = list.iterator();
		System.out.println("输出list中的元素");
		while(itra.hasNext()){
			System.out.print(itra.next()+" ");
		}
	}

}
