package day02wrapperclasses;

import java.util.Scanner;

public class Scanner08 {
	
	public static void main(String[]args) {
		
		//7) Mil’i kilometreye çeviren bir program yazınız. (double kullanınız) Not 1: km = mile x 1.6
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen mil cinsinden uzunlugu giriniz: ");
		double mil = scanner.nextDouble();
		
		System.out.println(mil+" mil "+(mil*16/10)+" km'dir.");
		
		
	
	}}
	
	
	
	
	


