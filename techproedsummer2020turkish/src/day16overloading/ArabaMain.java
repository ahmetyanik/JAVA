package day16overloading;

public class ArabaMain {

	public static void main(String[] args) {
		
		Araba ferrari01 = new Araba("Ferrari","F16","Ucak yakiti",3.8,true,2020);
		Araba renault = new Araba("Renault","Megane","Diesel",1.6,false,2009);
		AHayvanlar hayvan6 = new AHayvanlar("Pisik","Mavi Kedi","Kedi");
		AlistirmaAdresDefteri kisi02 = new AlistirmaAdresDefteri("Zeynep Duru Yanik", 3, false, "332 42 56 ",
				"Dietzgenstraße 77, 13156, Berlin-Pankow");
		
		
		
		
		ferrari01.bilgileriGöster();
		renault.bilgileriGöster();	
		hayvan6.BilgileriGöster();
		kisi02.BilgileriGöster();
		
		
		
		
		
	}

}
