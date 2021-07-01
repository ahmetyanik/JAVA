package day09switchoperator;

import java.util.Scanner;

public class Odev02 {

	

	public static void main(String[] args) {
		
//		Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın. 
//		“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın. 
//		Bu harﬂerin dışında bir character için “Geçersiz character” yazdırın.
		
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir harf giriniz: ");
		char ch = scanner.nextLine().charAt(0); 
		
		if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u') {
			
			ch = '1';
		
		}else if (ch == 'b'|| ch == 'c'|| ch == 'd'|| ch == 'f') {
			
			ch = '2';
		} else {
			
			
			ch = '3';}
			
			
		switch (ch) {
		
		case '1': 
			System.out.println("Sesli harf");
			break;
		case '2':
			System.out.println("Sessiz harf");
			break;
		default:
			System.out.println("Gecersiz character");
		}		
		scanner.close();
			
		}		
		
	
	}


