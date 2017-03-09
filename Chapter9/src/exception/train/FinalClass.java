package exception.train;

public final class FinalClass {
	int num =0;
	public void doit(){
		
	}
	public static void main(String[] args) {
		FinalClass finalobj = new FinalClass();
		finalobj.num++;
		System.out.println("在一个final类中增加成员变量num="+finalobj.num);

	}

}
