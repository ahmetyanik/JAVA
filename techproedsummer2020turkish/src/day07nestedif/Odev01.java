package day07nestedif;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		/*Kullanıcıdan cinsiyetini girmesini isteyin.  Erkek ise yaşını kontrol edin. 
		 * Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın. Yaşı 18 den büyük eşit ise 
		 * ekrana “Adam” yazdırın. Kadin ise yasini kontrol edin. 
		 * Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın. Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen cinsiyetinizi giriniz: ");
		String cinsiyet = scanner.next();
		System.out.print("Lütfen yasinizi giriniz: ");
		int yas = scanner.nextInt();
		
		if (cinsiyet.equalsIgnoreCase("erkek")||cinsiyet.equalsIgnoreCase("Kadin")) {
			
			if((yas<18 && cinsiyet.equalsIgnoreCase("Erkek"))) {
				System.out.print("Erkek Cocuk");
				
			}else if ((yas>=18 && cinsiyet.equalsIgnoreCase("Erkek"))) {
				System.out.print("Erkek Adam");
			}else if((yas<18 && cinsiyet.equalsIgnoreCase("Kadin"))) {
				System.out.println("Kiz Cocuk");
				
			}else if ((yas>=18 && cinsiyet.equalsIgnoreCase("Kadin"))) {
				System.out.println("Kadin");				
				
			}
		}	
		scanner.close();
	}


}
