package day32abstraction;

public class Aile extends Otel {

	public static void main(String[] args) {
	
		Aile müsteri2 = new Aile();
		
		müsteri2.kahvalti();
		System.out.println("Wifi Ücreti: "+müsteri2.wifi(3));
		
	}

	@Override
	public void kahvalti() {
		
		System.out.println("Kahvaltiniz kafeteryada olacaktir...");
		
	}

	
	
	

}
