package denemeler;

import java.util.Scanner;

public class Yediveyaucunkatlari {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz: ");
		int sayi = scanner.nextInt();
		int i = 0;
		for (;i<=sayi;i++) {
			
			if (i%3==0 && i%7==0) {
				
				System.out.println(i);					
				
			}
			
		}	

	}

}
