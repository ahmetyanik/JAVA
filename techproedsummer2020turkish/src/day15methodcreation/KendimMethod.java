package day15methodcreation;

import java.util.Scanner;

public class KendimMethod {
	
	public static int toplama() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci sayi: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Ikinci sayi: ");
		int num2 = scanner.nextInt();
		
		return  (num1+num2);
		
		
	}
	
	public static int carpma() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci sayi: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Ikinci sayi: ");
		int num2 = scanner.nextInt();		
		
		return  num1*num2;
		
	}
	

	public static void main(String[] args) {
	

//	System.out.println(toplama());

	System.out.println(carpma());	
	
	

	}

}
