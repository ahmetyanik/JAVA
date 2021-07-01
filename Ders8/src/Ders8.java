import java.util.Scanner;

public class Ders8 {
	
	/* MANTIKSAL BAGLACLAR
	 * 1- NOT  !   ----> true bir degeri false, false bir degeri true yapar
	 * 
	 * 2  AND  &&  -----> iki deger de true ise true verir. örnek;
	 * 
	 * 			true,true---> true
	 * 			false,true---> false
	 * 			true,false--->false
	 * 			false,false--->false
	 * 
	 * 3  OR   ||--------> iki degerden biri true ise sonucu true verir
	 * 
	 * 			true,true---> true
	 * 			false,true---> true
	 * 			true,false--->true
	 * 			false,false--->false 
	 *  
	 */
	public static void main(String[] args) {
		
	System.out.println("Sonuc:"+ !(3>4));	                            // not operatörü
	System.out.println("Sonuc:" + ((3>4) && ("yazilim" == "yazilim"))); // and fonksiyonu
	System.out.println("Sonuc:"+ ((3>4) || ("yazilim" == "yazilim")));   // or fonksiyonu
		
		
	// bunlari kullanarak kullanici adi ver girisi yapalim.
	
	String sys_kul_adi = "yazilimbilimi";
	String parola = "12345";
	
	Scanner scan = new Scanner(System.in);  // bu islemi ctrl+shift+o ile yapiyoruz
											//kullanicidan deger alabilmek icin 
	
	System.out.println("Kullanici Adi:");
	String kullanici_adi = scan.nextLine();
	System.out.println("Parola:");
	String kul_parola = scan.nextLine();
	
	
	if (!(sys_kul_adi.equals(kullanici_adi)) && !(parola.equals(kul_parola))){  // dikkat burada == kullanmadik. .equals kullandik
		
		System.out.println("Kullanici Adi ve Parola Yanlis");
		
		
	}
	
	else if ((sys_kul_adi.equals(kullanici_adi)) && !(parola.equals(kul_parola))) {   // dikkat burada == kullanmadik. .equals kullandik
		
		System.out.println("Parola Yanlis");
		
	}	
	else if (!(sys_kul_adi.equals(kullanici_adi)) && (parola.equals(kul_parola))) {   // dikkat burada == kullanmadik. .equals kullandik
		
		System.out.println("Kullanici Yanlis");
	}
		
	else 	{
		System.out.println("Giris Basarili...");
	}
		
		
		
		
		
		
		
	}
	

}
