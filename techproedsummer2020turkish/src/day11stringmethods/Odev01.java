package day11stringmethods;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		/*Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp 
		bitiş değerinde  biten tüm tamsayıları ekrana yazdırın*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen baslangic degerinizi giriniz: ");
		int numStart = scanner.nextInt();
		
		System.out.print("Lütfen bitis degerinizi giriniz: ");
		int numEnd = scanner.nextInt();
		
		
		for(int i=numStart; i>=numStart && i<numEnd+1; i++ ) {
			
			System.out.print(i+" ");
				
		}
		scanner.close();
	}

}
