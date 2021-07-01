package alistirmalar;

import java.util.Scanner;

public class ArmstrongSayisi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		double sayi = scanner.nextInt();
		
		
		
		String basamakSayisi = sayi+"";
		int basSay =basamakSayisi.length();
		
		
		double birler = 0;
		double toplam = 0;
		
		while(sayi>0) {
			
			birler = sayi%10;
			toplam = toplam + Math.pow(birler, basSay);
			birler = 0;
			sayi/=10;
			
		}System.out.println(toplam);
		
		if (toplam==sayi) {
			System.out.println(toplam+" bir Armstrong sayisidir.");
		}else {
			System.out.println(toplam+" bir Armstrong sayisi degildir.");
		}
		

	}

}
