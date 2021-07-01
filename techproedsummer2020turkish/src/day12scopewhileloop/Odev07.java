package day12scopewhileloop;

import java.util.Scanner;

public class Odev07 {

	public static void main(String[] args) {

//		Kullanıcıdan bir rakam alın ve bu rakam icin çarpım tablosunu 
//		ekrana yazdırın. Kullanıcının hata yapmadığını farz edin.  Ornegin kullanıcı 
//		3 girerse; 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your number: ");
		int number = scanner.nextInt();
		
		int num = number;
		int first = 1;
		int product = 1;
		
		while (first<=10) {
			
			product = num*first;
			System.out.print(num+"x"+first+"="+product+" ");
			first++;
		}
		
		
		scanner.close();	

	}

}
