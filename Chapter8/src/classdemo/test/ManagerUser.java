package classdemo.test;

/**
 * 管理员用户类
 * @author Roc-J
 *
 */
public class ManagerUser {
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

	public static void setInstance(ManagerUser instance) {
		ManagerUser.instance = instance;
	}

	private String name;
	private int id;
	private int level =1;
	
	private ManagerUser(){
	
	}
	
	private static ManagerUser instance = null;
	
	public synchronized static ManagerUser getInstance(){
		if (instance==null) {
			instance = new ManagerUser();
			return instance;
		}
		return instance;
	}
	
}
