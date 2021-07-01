import java.util.Scanner;

/* Fonksiyonlar
 * 
 *  Erisim Belirleyici(opsiyonel) ekstra özellikler Dönüs Tipi Fonksiyon Adi(parametreler) {
 *  
 *  		Burasi Fonksiyon Blogu
 *  		Fonksiyonun yapacagi islemler burada olacak
 *  }
 *  
 *  
 *  
 */
public class Ders914 {
	
	public static void selamlama() {
		
		System.out.println("Herkese selam...");
		System.out.println("Umarim iyisinizdir...");		
		
	}
	
	public static void faktoriyel() {
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Sayi:");
		
		int sayi = scan.nextInt();
		int faktoriyel = 1;
		
		while(sayi>0) {
			
			faktoriyel *= sayi;
			sayi--;
			
			
		}
		
		System.out.println("Faktoriyel: "+faktoriyel);
		
		
	}
	
	public static void main(String[] args) {
		
		selamlama();  //fonksiyon cagrisi

		faktoriyel();
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
}
}