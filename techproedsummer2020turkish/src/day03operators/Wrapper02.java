package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adinizi ve Soyadinizi Giriniz: ");
		String adSoyad = scanner.nextLine();
		
		System.out.println("L�tfen adresinizi yaziniz: ");
		String adres = scanner.nextLine();
		
		System.out.println("türkiye'de mi yasiyorsunuz? ");
		boolean türkiye = scanner.nextBoolean();
		
		System.out.println("Adiniz Soyadiniz: "+adSoyad);
		System.out.println("Adresiniz: "+ adres);
		System.out.println("türkiye'de mi yasiyorsunuz? "+türkiye);
		
		
		
		
		
		
		

	}

}
