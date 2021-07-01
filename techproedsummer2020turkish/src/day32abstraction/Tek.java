package day32abstraction;

public class Tek extends Otel {
	
	private int saat;
	
	public int tv(int saat) {
		return saat*2;
	}

	public static void main(String[] args) {
	
		Tek müsteri1 = new Tek();
		müsteri1.kahvalti();
		System.out.println("Tv ücreti: "+müsteri1.tv(5));
		System.out.println("Wifi ücreti: "+müsteri1.wifi(1));

	}

	@Override
	public void kahvalti() {
		
		System.out.println("Kahvaltiniz sandvictir...");
		
	}


}
