package silebilirsin2;


public class Main {

	public static void main(String[] args) {
	
		Calisanlar ahmetYanik = new Calisanlar("Ahmet Yanik", "51931040474","Bursa","16.12.1988","Uluslararasi Iliskiler"); 
		Y�netici nihatCaylak = new Y�netici("Nihat Caylak","12345678910","K�tahya","17.12.1965","Uluslararasi Iliskiler","10");
		SirketPersoneli hayatiKeskin = new SirketPersoneli("Hayati Keskin","9876543212","Konya","12.11.1967","Idari Hizmetler","Alfa");
		
		SirketPersoneli ismailAvci = new SirketPersoneli("Ismail Avci","766767676767","Adiyaman","15.04.1965","Uluslarasi Iliskiler","Alfa");
		Y�netici davutDursun = new Y�netici ("Davut Dursun", "2562728392", "Elazig", "12.09.1952","RT�K Baskanlik","550");
		Calisanlar ayseYanik = new Calisanlar("Ayse Yanik", "878787878790","Mersin","01.11.1989","Izleme ve Degerlendirme Dairesi");
		
		
	
	System.out.println(ahmetYanik.getDogumYeri());	
	ahmetYanik.setDogumYeri("Antalya");
	System.out.println(ahmetYanik.getDogumYeri());
	ahmetYanik.bilgileriG�ster();
		
		
	}
	

	}


