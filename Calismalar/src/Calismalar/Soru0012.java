package Calismalar;

import java.util.Scanner;

public class Soru0012 {

	public static void main(String[] args) {
		
		//Write a Java program that takes three numbers as input to calculate and prdouble the average of the numbers.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. sayi: ");
		double num1 = scanner.nextDouble();
		System.out.print("2. sayi: ");
		double num2 = scanner.nextDouble();
		System.out.print("3. sayi: ");
		double num3 = scanner.nextDouble();
		
		System.out.println((num1+num2+num3)/3);

	}

}
