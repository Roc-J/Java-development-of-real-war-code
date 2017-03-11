package set.train;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Emp emp1 = new Emp("wangyi", "001");
		Emp emp2 = new Emp("zhagnming", "005");
		Emp emp3 = new Emp("zggs","004");
		
		Map map = new HashMap<>();
		map.put(emp1.getId(), emp1.getName());
		map.put(emp2.getId(), emp2.getName());
		map.put(emp3.getId(), emp3.getName());
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			String str = (String) it.next();
			String name = (String) map.get(str);
			System.out.println(str+"  "+name);
		}
		
		Map map1 = new TreeMap<>();
		map1.putAll(map);
		Iterator ittr = map1.keySet().iterator();
		System.out.println(" π”√treeMap£∫");
		while(ittr.hasNext()){
			String str = (String) ittr.next();
			String name = (String) map1.get(str);
			System.out.println(str + "   "+ name);
		}
	}

}
