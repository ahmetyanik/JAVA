package day11stringmethods;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
		/*Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç 
		değerinden başlayıp bitiş değerinde  biten tüm tamsayıların çarpımını ekrana yazdırın*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen baslangic degerinizi giriniz: ");
		int start = scanner.nextInt();
		
		System.out.print("Lütfen bitis degerinizi giriniz: ");
		int end = scanner.nextInt();
		
		int carpim = 1;
		
		for(int i =start; i>=start && i<=end; i++) {
			
			carpim *=i;
			
		}System.out.println("Bu araliktaki tüm tamsayilarin carpimi: "+carpim);
		
		
		scanner.close();
		
		
		
		

	}

}
