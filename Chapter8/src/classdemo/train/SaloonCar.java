package classdemo.train;

public class SaloonCar extends Car {
	public int oil = 16;
	
	@Override
	public void drive() {
		if (oil>0) {
			super.drive();
			if (oil<20) {
				System.out.println("��������20%����ע�����~");
			}
		}else{
			System.out.println("���Ѿ�û�������ˣ�������ʻ��");
		}
		
	}

	public static void main(String[] args) {
		SaloonCar scar = new SaloonCar();
		scar.color="��ɫ";
		scar.gear(5);
		scar.drive();
	}

}
