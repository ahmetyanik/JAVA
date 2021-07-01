package day16overloading;

public class AlistirmaKitap {
	
	String kitapAdi;
	String yazar;
	int sayfaSayisi;
	String yayinevi;
	
	
	AlistirmaKitap(String kitapAdi, String yazar, int sayfaSayisi,String yayinevi){
		
		this.kitapAdi = kitapAdi;
		this.yazar = yazar;
		this.sayfaSayisi = sayfaSayisi;
		this.yayinevi = "Lale";		
		
	}
	

	public static void main(String[] args) {
		
		AlistirmaKitap Degirmen = new AlistirmaKitap("Degirmen", "Sabahattin Ali", 
									210,"Dogan Yayinevi");
		
		System.out.println(Degirmen.kitapAdi);
		System.out.println(Degirmen.sayfaSayisi);
		System.out.println(Degirmen.yayinevi);
		System.out.println(Degirmen.yazar);
		
		

	}

}
