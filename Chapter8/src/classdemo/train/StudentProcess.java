package classdemo.train;

public class StudentProcess {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("小米");
		s.setAge(18);
		s.setSex("女");
		System.out.println("姓名"+s.getName());
		System.out.println("年纪"+s.getAge());
	}

}
