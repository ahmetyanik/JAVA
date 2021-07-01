package day07nestedif;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		/*Kullanıcıdan password girmesini isteyin.  Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. 
		 * Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
		 *  Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen password giriniz: ");
		int password = scanner.nextInt();
		
		if(password%5==0) {
			
			if(password%10==0) {
				
				System.out.println(password+", 5'e bölünen cift bir sayidir.");
				
			}else {
				System.out.println(password+", 5'e bölünen tek bir sayidir.");
			}
			
			
		}else {
			System.out.println("Tekrar Deneyin!");
		}
		
		scanner.close();
		
	}

}
