package set.train;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Roc-J
 *
 */
public class People {
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public PK_People getNumber() {
		return number;
	}


	public void setNumber(PK_People number) {
		this.number = number;
	}


	private String name;
	private PK_People number;
	
	public People(String name,PK_People number){
		this.name = name;
		this.number = number;
	}
	
	
	public static void main(String[] args) {
		Map<PK_People, People> map = new HashMap<PK_People, People>();
		PK_People pk_person = new PK_People();
		pk_person.setPrefix("www");
		pk_person.setNumber(10);
		map.put(pk_person, new People("��С��", pk_person));
		
		PK_People pk_people2 = new PK_People();
		pk_people2.setPrefix("www");
		pk_people2.setNumber(10);
		People people2 = map.get(pk_people2);
		if (people2!=null) {
			System.out.println("�ö����ֵ: "+people2.getNumber().getNumber());
			System.out.println("�ö���value: "+ people2.getName());
		} else {
			System.out.println("û�иö���");
		}

	}

}
