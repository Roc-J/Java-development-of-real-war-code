package exception.train;

public final class FinalClass {
	int num =0;
	public void doit(){
		
	}
	public static void main(String[] args) {
		FinalClass finalobj = new FinalClass();
		finalobj.num++;
		System.out.println("��һ��final�������ӳ�Ա����num="+finalobj.num);

	}

}
