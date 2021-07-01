package day06ifstatetement;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın. “Cumartesi” ise ekrana 
		 * “Yahudiler icin kutsal gün” yazdırın. “Pazar” ise ekrana  “Hıristiyanlar icin kutsal gün” yazdırın
		 */

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen bir gün giriniz: ");
		String day = scanner.nextLine();
		
		
		if(day.equalsIgnoreCase("Cuma")) {
			
			System.out.println(day+" günü Müslümanlar icin kutsal gündür.");
		}else if (day.equalsIgnoreCase("Cumartesi")) {
			
			System.out.println(day+" günü Yahudiler icin kutsal gündür.");
		}else if (day.equalsIgnoreCase("Pazar")) {
			
			System.out.println(day+" günü Hristiyanlar icin kutsal gündür.");
		}else {
			
			System.out.println(day+" günü siradan bir gündür.");
		}
		
		
		
	}

}
