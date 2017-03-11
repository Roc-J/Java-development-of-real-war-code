package set.train;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ��Map�����Ԫ��<key,value>����� value
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
		System.out.println("Map�����еĶ�����: ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
