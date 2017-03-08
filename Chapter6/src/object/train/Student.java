package object.train;

/**
 * 三个构造方法
 * @author Roc-J
 *
 */
public class Student {
	public String name;
	public String sex;
	public int age;
	
	/**
	 * 无参构造
	 */
	public Student(){
		name="未登记";
		sex="未登记";
		age =0;
	}
	
	/**
	 * 构造参数
	 * @param name
	 */
	public Student(String name){
		this.name = name;
	}
	
	/**
	 * 构造
	 * @param name
	 * @param sex
	 * @param age
	 */
	public Student(String name,String sex,int age){
		this(name);
		this.sex = sex;
		this.age = age;
	}
	
	public void StudentInfo(){
		System.out.println("我的名字是:"+ name);
		System.out.println("我是"+sex+"生");
		System.out.println("我"+age+"岁了");
		System.out.println("================");
	}
	
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student("qjk");
		Student s3 = new Student("张磊", "男", 35);
		s1.StudentInfo();
		s2.StudentInfo();
		s3.StudentInfo();
	}
}
