package day30exceptions;

public class TryCatchÖrnekSoru2 {

	public static void main(String[] args) {
		
		try {
			hop();
		}catch(Exception e) {
			e.printStackTrace(); //printStackTrace() methodu Exception'larin nerede olustugunun 
								 //detayli bilgisini verir
								 //exception satirlarini olusum sirasina göre consolda gösterir
		}
		
	}
	
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}

}
