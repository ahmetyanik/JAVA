package alistirmalar;

import java.util.Scanner;

public class WhileTrueDöngüsüIleKendiKosulumuzuOlusturmak {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Sayi giriniz: ");
			int sayi = scanner.nextInt();
			
			if(sayi==-1) {
				
				System.out.println("Döngüden cikiliyor...");
				break;
			}
			System.out.println("Girmis oldugunuz sayi: "+sayi);
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
