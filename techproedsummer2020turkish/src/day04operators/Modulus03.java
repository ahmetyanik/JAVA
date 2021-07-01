package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
	
		System.out.println("Üc basamakli bir tamsayi giriniz: ");
		Scanner scanner = new Scanner(System.in);
		
		
		int sayi = scanner.nextInt();
		
		int birler = sayi%10;  // son rakam bulmak icin sayinin 10'a bölümünden kalan
		int yüzler = sayi/100;  //ilk rakam bulmak icin 3 basamakli ise 100'e; dört basamakli ise 1000' ... 
								//bölünür kalan alinir.
		int v = sayi/10;
		int onlar = v%10;
		
		System.out.println("Rakamlarin toplami: "+ (birler+yüzler+onlar));	
		

	}

}
