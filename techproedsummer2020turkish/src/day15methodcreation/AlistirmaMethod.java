package day15methodcreation;

import java.util.Scanner;

public class AlistirmaMethod {

	public static void main(String[] args) {
//		Write a Java method to find the smallest number among three numbers. Go to the editor
//		Test Data:
//		Input the first number: 25
//		Input the Second number: 37
//		Input the third number: 29
//		Expected Output:
//
//		The smallest value is 25.0
		
			karsilastir();

	}
	public static void karsilastir() {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ard arda 3 sayi giriniz: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if(num1>num2 && num3>num2) {
			
			System.out.println("En kücük sayi: "+num2);
			
		}else if(num1<num2 && num1<num3) {
			
			System.out.println("En kücük sayi: "+ num1);
		}else {
			
			System.out.println("En kücük sayi: "+ num3);
		}
		
	}
	
	
	
	

}
