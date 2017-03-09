package classdemo.test;

/**
 * ”√ªß¿‡
 * @author Roc-J
 *
 */
public class User {
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj==null) {
			return false;
		}
		if (getClass()!=obj.getClass()) {
			return false;
		}
		User other = (User)obj;
		if(id!=other.id){
			return false;
		}
		if (level!=other.level) {
			return false;
		}
		if (name==null) {
			if(other.name!=null)
				return false;
		}else if(!name.equals(other.name))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	private String name;
	private int id;
	private int level =1;
	
	
}
