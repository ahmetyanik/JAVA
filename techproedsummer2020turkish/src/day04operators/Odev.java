package day04operators;

import java.util.Scanner;

public class Odev {
	
	public static void main(String[]args) {
		
		System.out.println("Lütfen dört basamakli bir sayi giriniz: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int sayi = scanner.nextInt();
		
		int birler = sayi%10;
		int x = sayi%100;
		int onlar= x/10;
		int y = sayi%1000;
		int yüzler = y/100;
		int binler = sayi/1000;
		
		
		System.out.println("Sayinin rakamlari toplami: "+(birler+onlar+yüzler+binler));	
		
	}

}
