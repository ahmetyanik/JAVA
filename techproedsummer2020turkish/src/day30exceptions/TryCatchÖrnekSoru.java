package day30exceptions;

public class TryCatchÖrnekSoru {

	public static void main(String[] args) {
		
		
		try {
			hop();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}

}
