package myclass.struct;

/**
 * 将long类型数值强制转换成其他数据类型。
 * @author Roc-J
 *
 */
public class PConversion {

	public static void main(String[] args) {
		long myLong = 3456467567588L;
		System.out.println("原数是:" + myLong);
		System.out.println("转成int是:" + (int)myLong);
		System.out.println("转成short是:" + (short)myLong);
		System.out.println("转成byte是:" + (byte)myLong);
		System.out.println("转成flaot是:" + (float)myLong);
		System.out.println("转成char是:" + (char)myLong);
	}

}
