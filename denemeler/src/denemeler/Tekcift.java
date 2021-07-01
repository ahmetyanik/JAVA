package denemeler;

import java.util.Scanner;

public class Tekcift {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz: ");
		int sayi = scanner.nextInt();
		
		if(sayi % 2 ==0) {
			
			System.out.println("Sayi cift sayidir.");		
			
			
		}
		else {
			
			System.out.println("Sayi tek sayidir.");
			
		}	

	}

}
