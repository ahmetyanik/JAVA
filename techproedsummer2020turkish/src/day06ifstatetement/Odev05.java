package day06ifstatetement;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir tamsayı alın eğer tamsayı 10 dan kucuk ve 0’dan 
		 * büyük eşit ise ekrana  “Rakam” yazdırın. Diğer durumlarda ekrana “Sayı” yazdırın.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz: ");
		int num = scanner.nextInt();
		
		
		if(num>=0 && num <10) {
			
			System.out.println(num+" bir rakamdir.");
		}else {
			System.out.println(num+" bir sayidir.");
		}
		
		

	}

}
