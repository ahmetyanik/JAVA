package Day02;

import java.util.Scanner;

public class Alistirma04 {

	public static void main(String[] args) {
		// Scanner kullanarak kullanıcıdan saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen saati giriniz: ");
		int saat = scanner.nextInt();
		
		System.out.print("Lütfen dakikayi giriniz: ");
		int dakika = scanner.nextInt();
		
		System.out.print("Lütfen saniyeyi giriniz: ");
		int saniye = scanner.nextInt();
		
		System.out.print("AM veya PM giriniz: ");
		String gg = scanner.next();
		
		System.out.println(saat+":"+dakika+":"+saniye+" "+gg);
		
		
		scanner.close();
		

	}

}
