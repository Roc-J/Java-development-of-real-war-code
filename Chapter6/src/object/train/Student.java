package object.train;

/**
 * �������췽��
 * @author Roc-J
 *
 */
public class Student {
	public String name;
	public String sex;
	public int age;
	
	/**
	 * �޲ι���
	 */
	public Student(){
		name="δ�Ǽ�";
		sex="δ�Ǽ�";
		age =0;
	}
	
	/**
	 * �������
	 * @param name
	 */
	public Student(String name){
		this.name = name;
	}
	
	/**
	 * ����
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
		System.out.println("�ҵ�������:"+ name);
		System.out.println("����"+sex+"��");
		System.out.println("��"+age+"����");
		System.out.println("================");
	}
	
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student("qjk");
		Student s3 = new Student("����", "��", 35);
		s1.StudentInfo();
		s2.StudentInfo();
		s3.StudentInfo();
	}
}
