package day11stringmethods;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		/*Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden veya sonrasından   
		başlayıp bitiş değerinde veya öncesinde  biten tüm çift tamsayıları ekrana yazdırın*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen baslangic degerini giriniz: ");
		int numStart = scanner.nextInt();
		System.out.print("Lütfen bitis degerini giriniz: ");
		int numEnd = scanner.nextInt();
		
		
		int numNewStart = numStart%2==0 ? numStart : (numStart+1) ; 
		
		for (int i = numNewStart; i<=numEnd && i>=numStart;i+=2) {
			
			System.out.print(i+" ");
			
		}		
		scanner.close();	

	}

}
