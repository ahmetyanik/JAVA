package alistirmalar;

import java.util.Scanner;

public class WhileDöngüsüileRakamlarinToplaminiBulmak {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi= scanner.nextInt();
		
		int toplam = 0;
		
		while(sayi>0) {
			
		toplam += sayi%10;
		sayi /= 10;
			
			
		}System.out.println("Rakamlar toplami: "+toplam);
		

	}

}
