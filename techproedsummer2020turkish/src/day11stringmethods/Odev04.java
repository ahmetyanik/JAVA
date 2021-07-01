package day11stringmethods;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		/*Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden 
		başlayıp bitiş değerinde  biten tüm tamsayıların toplamını ekrana yazdırın*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen baslangic degerinizi giriniz: ");
		int start = scanner.nextInt();
		
		System.out.print("Lütfen bitis degerinizi giriniz: ");
		int end = scanner.nextInt();
		
		int product = 0;
		
		for(int i = start; i<=end ; i++) {
		
			product +=i;
			
		}System.out.println("Bu araliktaki tüm tamsayilarin toplami: "+product);
		
		scanner.close();
		
		
		
		
		
		
		
		

	}

}
