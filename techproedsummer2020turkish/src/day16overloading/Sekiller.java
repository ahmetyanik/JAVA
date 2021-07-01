package day16overloading;

public class Sekiller {
	
	String ad;
	int kenarSayisi;
	String alan;
	String hacim;
	
	Sekiller(String ad, int kenarSayisi, String alan, String hacim){
		
		this.ad = ad;
		this.kenarSayisi = kenarSayisi;
		this.alan = alan;
		this.hacim = hacim;
		
	}
	
	public void bilgileriGöster(){
		
		System.out.println("Seklin adi         : "+ad);
		System.out.println("Seklin kenar sayisi: "+kenarSayisi);
		System.out.println("Seklin alani	   : "+alan);
		System.out.println("Seklin hacmi	   : "+hacim);
	}
	
	

	public static void main(String[] args) {
		
		Sekiller ücgen1 = new Sekiller("Eskenar Ücgen",3,"(Taban x Yükseklik)/2","Yok");
		ücgen1.bilgileriGöster();

	}

}
