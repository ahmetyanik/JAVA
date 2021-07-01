package day32abstraction;

public class Kral extends Otel {
	
	private String international;
	private int saat;
	
	public int tv(String international,int saat) {
		if(international.equals("international")) {
			
			return saat*5;
		}else {			
			return 0;
		}
		
		
	}

	public static void main(String[] args) {
		
		Kral müsteri3 = new Kral();
		
		müsteri3.kahvalti();
		System.out.println("Wifi Ücreti: "+müsteri3.wifi(6));
		System.out.println("Tv Ücreti: "+müsteri3.tv("international", 4));
		

	}

	@Override
	public void kahvalti() {
		
		System.out.println("Kahvaltiniz teras kat Kral Restaurant'tadir...");
		
	}


	
	

}
