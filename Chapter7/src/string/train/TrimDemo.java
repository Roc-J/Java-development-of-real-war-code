package string.train;

public class TrimDemo {

	public static void main(String[] args) {
		String str = "  Hi~how are you        ";
		System.out.println("ԭ�ַ�����"+str+",������"+str.length());
		String nstr = str.trim();
		System.out.println("ȥ�����ҵĿո���ַ�����"+nstr+",������"+ nstr.length());

	}

}
