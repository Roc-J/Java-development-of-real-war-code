package object.train;

public class StaticCode {
	static int count;
	static {
		count=0;
		System.out.println("StaticCode�౻���أ������Գ�ʼ����ϣ�");
	}
	
	public StaticCode(){
		count++;
		System.out.println("����StaticCode��ĵ�"+count+"������");
	}
}
