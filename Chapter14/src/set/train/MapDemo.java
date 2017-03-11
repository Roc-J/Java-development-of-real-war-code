package set.train;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 向Map中添加元素<key,value>，输出 value
 * @author Roc-J
 *
 */
public class MapDemo {

	public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put("001", "china");
		map.put("002", "USA");
		map.put("003", "Australia");
		Set keys = map.keySet();
		for (Object object : keys) {
			System.out.println(object.toString());
		}
		Collection<String> cll = map.values();
		Iterator<String> it = cll.iterator();
		System.out.println("Map集合中的对象有: ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
