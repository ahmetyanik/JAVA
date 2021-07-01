package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {
	

	public static void main(String[] args) {
		//Kullanicidan sayi alin
		//Sayi 10 dan kücük ise ekrana "Kazandiniz" yazdirin
		//Sayi 10 veya 10 dan büyük ise ekrana "Sayi giriniz: " yazdirin
		
		Scanner scanner = new Scanner(System.in);
		int num;
		
		
		do {
			System.out.print("Sayi giriniz: ");
			num = scanner.nextInt();
			
		}while(num>=10);
		
		System.out.println("Kazandiniz");	
		

	}

}
