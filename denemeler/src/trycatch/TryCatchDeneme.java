package trycatch;

import java.util.Arrays;
import java.util.Scanner;

public class TryCatchDeneme {

	public static void main(String[] args) throws ArithmeticException{
		
		
		int num1=12;
		int num2=0;
		
		try {
			
			System.out.println(num1/num2);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Bir sayi sifira bölünemez!");
			
		}
		
		
		int a [] = {1,2,3,4,5};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir array indexi giriniz: ");
		int x = scanner.nextInt();
		
		try {
			
			System.out.println(a[x]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'in index sinirini astiniz!");
					
		}
		finally {
			
			System.out.println("Finally Blogu Calisti...");
			
		}
		
		
		
			
			
			
	
		
		
		
		
		

	}

}
