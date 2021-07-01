package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		//Kullanicidan password girmesini isteyin
		//Password 4 basamakli bir sayi ise cift olup olmadigini konrol edin
		//Cift ise "password tamam" yazdirin 

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int num = scanner.nextInt();
		
		if(num>999 && num<10000) {
			
			if(num%2==0) {
				
				System.out.println("Password tamam");
			}else {
				
				System.out.println("Tekrar deneyin a");
			}
			}else {
				
				System.out.println("Tekrar deneyin b");
			
			
		}
		
		scanner.close();
		

	}
	
	
}
	