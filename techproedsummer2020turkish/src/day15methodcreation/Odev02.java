package day15methodcreation;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {

		
//		Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, birinci sayı 
//		büyük ise ekrana “Birinci sayı büyük”, ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci Sayi: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Ikinci Sayi: ");
		int num2 = scanner.nextInt();

		
		karsilastir(num1,num2);		

	}
	

	
	public static void karsilastir(int num1, int num2) {
		
		if(num1>num2) {
			
			System.out.println("Birinci sayi büyük");
		}else if(num1==num2){
			System.out.println("Esit");
		}else {
			System.out.println("Ikinci sayi büyük");
		}
		
	}
	

}
