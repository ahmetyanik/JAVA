Metodlarda RETURN

public class Ders916 {
	
	/*public static void toplama(int a, int b, int c) {
		
		System.out.println("Toplamlari: " + (a+b+c));
		
				
			
	}
	
	public static void main(String[] args) {
		
		
		toplama(3,4,5);  // burada sadece ekrana yazi yazmis oluyor. deger vermiyor.
						// bu deger vermeyen fonksiyonlara void fonksiyonlar denilmektedir.
	}
	*/
	// simdi return'ü anlamaya calisalim
	
	public static int toplamak(int a, int b, int c) {  //void yazmadik. cikti tipi icin int yazdik
		
		return (a+b+c);
						
			
	}
	
	public static void main(String[] args) {
		
		System.out.println("Fonksiyondan dönen deger:" + toplamak(3,4,5));
		// burada return yapmamis olsaydik toplamak(3,4,5) degerini cagiramazdik. cünkü o bir deger degildi
	}

	
}
