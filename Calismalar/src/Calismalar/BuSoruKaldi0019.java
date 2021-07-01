package Calismalar;

import java.util.Scanner;

public class BuSoruKaldi0019 {

	public static void main(String[] args) {
		/*Write a Java program to convert a decimal number to binary number. Go to the editor
		Input Data:
		Input a Decimal Number : 5*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sayinizi hangi tabana cevirmek istersiniz?: ");
		int taban = scanner.nextInt();
		System.out.print("Lütfen bir sayi giriniz: ");
		
		int num = scanner.nextInt();
		int birler = 0;
		
		for (int i = 0; i <= num; i++) {			
				
			if (num != 0) {
				birler = num % taban;
				num = num/taban;
				i++;
			}else {
				birler = num/taban;
			}
				System.out.println(birler);
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		

	}


