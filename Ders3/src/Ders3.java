import java.util.Locale;
import java.util.Scanner;

public class Ders3 {

	public static void main(String[] args) {
		
	// Kullanicidan bilgi alma	
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir sayi giriniz:");
	
	int a = scan.nextInt();     //tamsayi deger atayan fonksiyon
	
	System.out.println("a degiskeninin degeri:"+a);
		
	/*dikkat eger ondalikli sayi gireceksek . koydugumuzda hata vermemesi icin bunu
	 * scan'e tanittirmamiz gerekmektedir. 	
	 */
	//scan.useLocale(Locale.US);	// bununla ilgili örnek yapmadik
	
	// Stringler icin;
	
	System.out.println("Bir yazi giriniz:");
	String b = scan.nextLine();
	
	
	
	}
	
}
