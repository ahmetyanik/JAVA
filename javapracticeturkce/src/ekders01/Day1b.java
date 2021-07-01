package ekders01;

import java.util.Scanner;

public class Day1b {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alalim ve bu sayilarin 4 islem sonucunu ekrana yazdiralim
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci Sayi: ");
		double x = scanner.nextDouble();
		System.out.println("Ikinci Sayi: ");
		double y = scanner.nextDouble();
		
		double toplam = x+y;
		double carpim = x*y;
		double cikarma = x-y;
		double bölme = x/y;
		
		System.out.println(toplam);
		System.out.println(carpim);
		System.out.println(cikarma);
		System.out.println(bölme);
		
		
		
	}

}
