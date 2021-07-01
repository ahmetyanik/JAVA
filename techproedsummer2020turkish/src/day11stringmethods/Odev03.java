package day11stringmethods;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
		/*Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden 
		veya sonrasından başlayıp bitiş değerinde veya öncesinde  biten tüm 3 ile 
		bölünebilen tamsayıları ekrana yazdırın.*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen baslangic degerinizi giriniz: ");
		int start = scanner.nextInt();
		
		System.out.print("Lütfen bitis degerinizi giriniz: ");
		int end = scanner.nextInt();
		
		int tribleStart = start%3==0 ? start : (start+1)%3 == 0 ? start+1 : start+2;
		
		for (int i = tribleStart ; i>= tribleStart && i<=end;i+=3) {
			
			System.out.print(i+" ");
		}
		
		
	scanner.close();	
		
		
		

	}

}
