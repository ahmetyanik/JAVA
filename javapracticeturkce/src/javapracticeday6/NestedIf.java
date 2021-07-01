package javapracticeday6;

import java.util.Scanner;

public class NestedIf {

	public static void main(String1[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi1: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Sayi2: ");
		int num2 = scanner.nextInt();
		
		System.out.print("Sayi3: ");
		int num3 = scanner.nextInt();
		
		if(num1>num2 && num1>num3) {
			
			System.out.println(num1+" en büyük sayidir");
			
			if(num2>num3) {
				
				System.out.println(num3 +" en kücük sayidir");
			}else {
				System.out.println(num2 + " en kücük sayidir");
			}		
		
		}
		
			else if(num2>num1 && num2>num3) {
			
			System.out.println(num2+" en büyük sayidir");
			
			if(num1>num3) {
				
				System.out.println(num3 +" en kücük sayidir");
			}else {
				System.out.println(num1 + " en kücük sayidir");
			}

	}
		
			else if(num3>num1 && num3>num2) {
			
			System.out.println(num3+" en büyük sayidir");
			
			if(num2>num1) {
				
				System.out.println(num1 +" en kücük sayidir");
			}else {
				System.out.println(num2 + " en kücük sayidir");
			}

		}
	}
}
