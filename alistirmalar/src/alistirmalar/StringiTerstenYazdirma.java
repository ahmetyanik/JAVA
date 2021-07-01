package alistirmalar;

import java.util.Scanner;

public class StringiTerstenYazdirma {

	public static void main(String[] args) {
		
		//Write a Java program to reverse a string. 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yazi: ");
		String yazi = scanner.nextLine();
		
		String ters = "";
		
		int length = yazi.length();
		
		for(int i = 0; i<=length-1;i++) {
			
			ters +=yazi.charAt(length-1-i);
			
				
		}System.out.println(ters);
		
		
		
		
		
		

	}

	private static int indexOf(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
