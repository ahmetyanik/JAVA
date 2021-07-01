package day16overloading;

public class AlistirmaAdresDefteri {
	
	String adSoyad = "Ahmet Yanik";
	int yas = 32;
	boolean medeniHal = true;
	String telNo = "0312 415 80 70";
	String adres = "Dietzgenstraße 77, 13156, Berlin-Pankow";	

	
	AlistirmaAdresDefteri(String adSoyad, int yas, boolean medeniHal, String telNo, String adres) {
		
		this.adSoyad = adSoyad;
		this.yas = yas ;
		this.medeniHal = medeniHal;
		this.telNo = telNo;
		this.adres = adres;
		
	}

	public void BilgileriGöster() {
		
		System.out.println("******************************");
		System.out.println(adSoyad+ " kisisinin bilgileri:");
		System.out.println("Ad: "+adSoyad);
		System.out.println("Yas: "+yas);
		System.out.println("Medeni Hal: "+medeniHal);
		System.out.println("Telefon Numarasi: "+telNo);
		System.out.println("Adres: "+adres);
		System.out.println("******************************");
	}
	
	
	
	
	
}
