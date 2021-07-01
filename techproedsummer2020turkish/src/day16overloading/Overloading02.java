package day16overloading;

public class Overloading02 {

	public static void main(String[] args) {
		
		

	}
	//note 1: return type'i degistirmek overloading icin yeterli degildir!
	// java methodlarin farkli olup olmadiklarini anlamak icin iki seye bakar.
	//		a) method ismine       b) parametrelere bakar
	// Method ismi ve parametreler java icin methodlarin imzasi gibidir
	// javada method imzasi yerine "method signature" denir
	
	//note 2: acces modifier'lari degistirmek de methodlari java acisindan farkli hale getirmez
	//cünkü acces modifier'lar method signature'a dahil degildir
	
	//note 3: methodlarin body'sini degistirmek de metodlari java acisindan farkli hale getirmez.
	// cünkü bodyler de metod signature'a dahil degildir.
	
	//note 4: siz daha kodu yazarken yani kodu calistirmadan önce java sizi yaptiginiz hatalardan
	//dolayi uyarirsa bu tip hatalara "Compile Time Error" denir.
	
	// note 5: kodu yazarken herhangi bir hata yok fakat kodu calistiktan sonra konsolda 
	// kirmizi hata mesajlari alirsaniz bu hatalara "Run Time Error" denir.
	
	// note 6: Overloading "Compile Time Error" verir. (önemli mülakat sorusu)
	
//	public static void carpma(int num1, int num2) {
//		
//		System.out.println(num1*num2);
//	}
	
//	public static int carpma(int num1, int num2) {
//		
//		return num1*num2;

}
