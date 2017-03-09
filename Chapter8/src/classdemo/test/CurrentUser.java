package classdemo.test;

/**
 * 当前登录用户类
 * @author Roc-J
 *
 */
public class CurrentUser {
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
	
	
	private CurrentUser(){
		
	}
	
	private static final CurrentUser instance = new CurrentUser();
	
	public static CurrentUser getInstance(){
		return instance;
	}
}
