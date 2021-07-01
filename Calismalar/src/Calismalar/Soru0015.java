package Calismalar;

import java.util.Scanner;

public class Soru0015 {

	public static void main(String[] args) {

		//Write a Java program to swap two variables.
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Lütfen bir sayi giriniz: ");
		int a = scanner.nextInt();
		System.out.print("Lütfen ikinci sayinizi giriniz: ");
		int b = scanner.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		
		
		System.out.println(a+"-"+b);
		
	
		
		
		

	}

}
