package day04operators;

import java.util.Scanner;

public class InterwievSorusu01 {

	public static void main(String[] args) {
		// iki tane variable degerlerini yer degistiriniz
		// sayi1=12, sayi2=30 ==> sayi1=30, sayi2=12 (bu isleme swap denir)
		
		
		//1.yol
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yerlerini degistirmek icin iki sayi giriniz: ");
		double sayi1 = scanner.nextDouble();
		double sayi2 = scanner.nextDouble();
		double gecici = 0.0;
		
		gecici=sayi1;
		sayi1 = sayi2;
		sayi2 = gecici;
		
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		
		//2.yol GECICI DEGER ATAMADAN YAPMAK
		
		System.out.println("Yerlerini degistirmek icin iki sayi daha giriniz: ");
		double sayi3 = scanner.nextDouble();
		double sayi4 = scanner.nextDouble();
		
		
		sayi3 = sayi3 + sayi4;
		sayi4 = sayi3 - sayi4;
		sayi3 = sayi3 - sayi4;
		
		System.out.println(sayi3);
		System.out.println(sayi4);	
		
	}

}
