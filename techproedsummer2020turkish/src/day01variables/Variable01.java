package day01variables;

public class Variable01 {
	
	public static void main (String[]args) {
		
		int maas;
		char harf = 'S';
		int yas = 35;
		boolean isOld = true; // boolean ifadeler icin sadece true yada false degerleri kullanilabilir
		boolean isNew = false;
		byte derinlik = -123; 
		short nazilliNüfus = 28000;
		long hücreSayisi = 3535399988787887898L; // integer sinirini asan long variable'larda en sona 'L' harfi koymaliyiz.
		double piSayisi = 3.14776765645454; // java bütün ondalik kesirleri otomatik olarak double kabul eder.
		float para = 5.25f; // eger bir ondalik kesri float yapmak isterseniz sonuna "f" veya "F" konur.
		String takim = "Galatasaray";
		
		
		
		System.out.println(yas);
		System.out.println(harf);
		System.out.println(isOld);
		System.out.println(isNew);
		System.out.println(derinlik);
		System.out.println(nazilliNüfus);
		System.out.println(hücreSayisi);
		System.out.println(piSayisi);
		System.out.println(para);
		System.out.println(takim);		
		
	}	

}
