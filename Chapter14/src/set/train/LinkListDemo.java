package set.train;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ��ʾLinkListʹ��
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
		System.out.println("���list�е�Ԫ��");
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();
		list.set(1, b);
		list.add(2, c);
		Iterator<String> itra = list.iterator();
		System.out.println("���list�е�Ԫ��");
		while(itra.hasNext()){
			System.out.print(itra.next()+" ");
		}
	}

}
