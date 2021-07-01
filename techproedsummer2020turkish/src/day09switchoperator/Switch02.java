package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
//		Kullanici haftanin gün numarasini girsin
//		Programiniz günün ismini yazsin
//		Yanlis gün girerse "Gecerli gün sayisi giriniz"
//		switch() kullanarak yapiniz
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Haftanin gün nosunu giriniz: ");
		int day = scanner.nextInt();
		
		
		switch(day) {
			case 1:
				System.out.println("Pazartesi");
				break;
			case 2:
				System.out.println("Sali");
				break;
			case 3:
				System.out.println("Carsamba");
				break;
			case 4:
				System.out.println("Persembe");
				break;
			case 5:
				System.out.println("Cuma");
				break;
			case 6:
				System.out.println("Cumartesi");
				break;
			case 7:
				System.out.println("Pazar");
				break;
			
			default:
				System.out.println("Gecerli gün sayisi giriniz.");
		}
		
		scanner.close();
	}

}
