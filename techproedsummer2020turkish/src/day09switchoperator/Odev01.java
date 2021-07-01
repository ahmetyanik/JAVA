package day09switchoperator;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
//		Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdırın. 
//		“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdırın. “Pazar” ise ekrana  
//		“Hıristiyanlar için kutsal gün” yazdırın. Diler günler icin “Kutsal gün değil” yazdırın.
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir gün giriniz: ");
		String day = scanner.nextLine();
		
		
		switch (day) {
		
		case ("cuma"):
			System.out.println("Müslümanlar icin kutsal gün.");
		    break;
		case ("cumartesi"):
			System.out.println("Yahudiler icin kutsal gün");
			break;
		case ("pazar"):
			System.out.println("Hristiyanlar icin kutsal gün");
			break;
		default:
			System.out.println("Kutsal gün degil!");		
		
		
		}
		
		scanner.close();
		
		

	}

}
