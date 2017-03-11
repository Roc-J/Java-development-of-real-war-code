package set.train;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PeopleHashSetDemo {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String name;
	private long id;
	
	public PeopleHashSetDemo(String name,long id){
		this.name = name;
		this.id = id;
	}
	
	public static void main(String[] args) {
		Set set = new HashSet<>();
		PeopleHashSetDemo p1 = new PeopleHashSetDemo("程明", 123);
		PeopleHashSetDemo p2 = new PeopleHashSetDemo("王红", 254);
		PeopleHashSetDemo p3 = new PeopleHashSetDemo("赵倩", 1234535);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		Iterator<PeopleHashSetDemo> it = set.iterator();
		System.out.println("集合中的元素: ");
		while(it.hasNext()){
			PeopleHashSetDemo item = it.next();
			System.out.println(item.getName()+":"+item.getId());
		}

	}

}
