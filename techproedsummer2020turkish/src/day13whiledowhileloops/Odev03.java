package day13whiledowhileloops;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {

//		Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız. 
//		Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
		
		System.out.println("*******while loop************");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int num = scanner.nextInt();
		
		
		int i = 1;
		
		while(i<=num) {
			
			if(num%i==0) {
				
			
			System.out.print(i+" ");
				
			}
			i++;
		}
			System.out.println();
			System.out.println("*******for loop************");
			
			System.out.print("Bir sayi giriniz: ");
			int num1 = scanner.nextInt();
			
			
			
			for(int j = 1; j<=num1; j++) {
				
				if(num1%j==0) {
					
				System.out.print(j+" ");
				
			}
			
			
		}
		
		
		scanner.close();		

	}

	}
