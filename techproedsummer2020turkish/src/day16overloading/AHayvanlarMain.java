package day16overloading;

public class AHayvanlarMain {

	public static void main(String[] args) {
		
		AHayvanlar hayvan1 = new AHayvanlar("Boncuk","Van Kedisi","Kedi");
		AHayvanlar hayvan2 = new AHayvanlar("Mavis","Muhabbet Kusu","Kus");
		AHayvanlar hayvan3 = new AHayvanlar("Kral", "Doberman Köpek","Köpek");
		AHayvanlar hayvan4 = new AHayvanlar("Cicis","Yaban Ördegi","Kus");
		AHayvanlar hayvan5 = new AHayvanlar(); // default constructor
		AHayvanlar hayvan6 = new AHayvanlar("Pisik","Mavi Kedi","Kedi");
		
		
		
		
		hayvan1.BilgileriGöster();
		hayvan2.BilgileriGöster();
		hayvan3.BilgileriGöster();
		hayvan4.BilgileriGöster();
		hayvan5.BilgileriGöster();
		hayvan6.BilgileriGöster();

	}
	
	
	

}
