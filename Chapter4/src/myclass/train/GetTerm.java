package myclass.train;

/**
 * ������Ʒ�۸��Լ��Ƿ���ۣ����������ж�
 * @author Roc-J
 *
 */
public class GetTerm {

	public static void main(String[] args) {
		double price = 110.5;
		boolean isRebate = true;
		if (price<50) {
			System.out.println("�������Ʒ��");
		} else if(isRebate){
			System.out.println("��Ȼ���ۣ����Ҿ��ÿ��Թ���");
		} else if(price>100)
			System.out.println("̫���ˣ��һ��ǲ����˰ɣ�");
		System.out.println("�������~");
	}

}
