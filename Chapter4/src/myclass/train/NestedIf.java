package myclass.train;

/**
 * ������Ʒ�۸��Լ��Ƿ���ۡ����۶������������жϡ�
 * @author Roc-J
 *
 */
public class NestedIf {

	public static void main(String[] args) {
		boolean isRebate = true;
		double reBate =8;
		double price = 110.5;
		if (price<50) {
			System.out.println("�������Ʒ~");
		}else if(isRebate){
			System.out.println("���۵Ļ����������롣");
			if(reBate<7.5){
				System.out.println("�ۿۺܲ����Ҿ��ÿ��Թ���");
			}else{
				System.out.println("���ۺ���Ҳ���ù󣬻��Ƿ�������ɣ�");
			}
		}else if(price>100){
			System.out.println("̫���ˣ��Ҳ������ⶫ��~");
		}
		System.out.println("ѡ�����~");
	}

}
