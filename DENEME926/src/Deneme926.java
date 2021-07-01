
public class Deneme926 {
		
	
	public static void skorhesapla(String isim, int skor) {
		
		System.out.println(isim+" isimli oyuncunun skoru: "+ skor);
		
	}
		
	public static void skorhesapla(String isim) {
		
		System.out.println(isim+" isimli oyuncunun skoru bulunmamaktadir. ");

	}

	public static void skorhesapla(int skor) {
	
	System.out.println("isimsiz oyuncunun skoru: "+ skor);	
	
	}
	
	public static void main(String[] args) {
	
	skorhesapla("Ahmet",24);
	skorhesapla("Ahmet");
	skorhesapla(24);
	
	
}}
