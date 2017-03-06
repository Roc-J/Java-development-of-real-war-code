package myclass.train;

/**
 * 判断顾客对商品折扣的反应情况，分别定义折扣为1至2折，3至4折，5至6折，7至8折，和其他折扣时的输出内容。
 * @author Roc-J
 *
 */
public class GetSwitch {

	public static void main(String[] args) {
		double reBate = 8;
		switch ((int)reBate) {
		case 1:
		case 2:
			System.out.println("怎么会这么好，难道天上掉馅饼！");
			break;
		case 3:
		case 4:
			System.out.println("商场是要倒闭了么");
			break;
		case 5:
		case 6:
			System.out.println("今天是不是有好事发生，我要买买买！");
			break;
		case 7:
		case 8:
			System.out.println("这商场在搞促销啊！");
			break;
		default:
			System.out.println("我觉得和原价差不多啊！");
		}

	}

}
