package day14dowhileloop;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
//		Kullanıcıya iki sayı girmesini söyleyin. Bu sayılar eşit ise ekrana 
//		“Kare oluşturdunuz” yazdırın. Eşit değilse tekrar iki sayı girmesini söyleyin.
		
		Scanner scanner = new Scanner(System.in);

		int num1;
		int num2;
		
		do {
			
			System.out.print("Birinci sayi: ");
			num1 = scanner.nextInt();
			
			System.out.print("Ikinci sayi: ");
			num2 = scanner.nextInt();
			
			if(num1==num2) {
				
				System.out.println("Kare olusturdunuz!");
			}
			
			
		}while(!(num1==num2));
		

	}

}
