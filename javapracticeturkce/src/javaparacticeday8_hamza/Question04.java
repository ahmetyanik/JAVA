package javaparacticeday8_hamza;

import java.util.Random;
import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi giriniz:");
		int x = scanner.nextInt();
		
		String str = x+"";
		int y = 0;
		int toplam = 0;
		
		for(int i =str.length()-1; i>=0;i--) {
			
			toplam += Integer.parseInt(str.substring(i, i+1));

			
		}
		
		
		
		System.out.println(toplam);
		
	}
		
		
	}
	
	
	


