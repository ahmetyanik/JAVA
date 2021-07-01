package day06ifstatetement;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		/* Kullanıcıdan iki sayı alın eğer sayıların işaretleri  aynı ise ekrana
		 *  “Aynı işaretli” yazdırın. Sayıların işaretleri  farklı ise ekrana “Farklı işaretli” yazdırın.
		 */

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz: ");
		int num = scanner.nextInt();
		
		
		if (num<0) {
			
			System.out.println(num+" bir negatif sayidir");
		}else if(num==0) {
			
			System.out.println(num+" nötr bir sayidir.");
		}else {
			
			System.out.println(num+" pozitif bir sayidir.");
		}
		
		
		
		
		
	}

}
