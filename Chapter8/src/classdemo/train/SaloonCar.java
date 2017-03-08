package classdemo.train;

public class SaloonCar extends Car {
	public int oil = 16;
	
	@Override
	public void drive() {
		if (oil>0) {
			super.drive();
			if (oil<20) {
				System.out.println("油量不足20%，请注意加油~");
			}
		}else{
			System.out.println("车已经没有油量了，不能行驶。");
		}
		
	}

	public static void main(String[] args) {
		SaloonCar scar = new SaloonCar();
		scar.color="白色";
		scar.gear(5);
		scar.drive();
	}

}
