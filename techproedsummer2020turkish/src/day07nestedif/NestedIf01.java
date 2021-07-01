package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi alin
		//Bu sayi pozitif ise 9'dan büyük mü diye kontrol edin, 9'dan büyükse ekrana "sayi" yazdirin
		//9'dan kücük esit ve sifirdan büyük esit ise ekrana "rakam" yazdirin
		//Bu sayi negatif ise ekrana "sayi" yazdirin
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen bir tamsayi giriniz: ");		
		int num = scanner.nextInt();
		
		if(num>=0) {
			
			if(num>9) {
				System.out.println("Sayi");
			}else if(num<=9 && num>=0) {
				System.out.println("Rakam");
			}
		}else {
			System.out.println("Sayi");
		}
				
		scanner.close();
		
	}
	
	

}
