package Calismalar;

import java.util.Scanner;

public class Soru0007 {

	public static void main(String[] args) {
		
		/*Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
			Test Data:
			Input a number: 8
			Expected Output :
			8 x 1 = 8
			8 x 2 = 16
			8 x 3 = 24
			...
			8 x 10 = 80*/
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen sayinizi giriniz: ");
		int sayi = scanner.nextInt();
		
		
		for (int i=0; i<=10;i++) {
			
			System.out.println(sayi+"x"+i+":"+sayi*i);		
			
		}
		
		
		

	}

}
