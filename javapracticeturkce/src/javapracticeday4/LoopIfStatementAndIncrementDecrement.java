package javapracticeday4;

import java.util.Scanner;

public class LoopIfStatementAndIncrementDecrement {

	public static void main(String[] args) {
		
	/*	Yeni bir class olusturunuz adi
		 LoopIfStatementsAndIncrementDecrement olsun
		 bir userName (kullanici adi)olusturunuz ve onun ozellikleri sirasi ile soyle olmalidir;
		 1_uzunlugu => en az 8 karakter (chars) olmalidir
		 2_icinde sadece alfabetik karakterler bulunmalidir*/		 
		 

		
		Scanner scanner = new Scanner(System.in);
		
		String userName ="SelimTopbas}".toLowerCase();		
		int count = 0;
		
	
		if (userName.length()>=8) {
		
			for(int i=0; i<userName.length(); i++) {
				char temp = userName.charAt(i);
				
				if(!(temp >='a' && temp<='z')) {
					
					count ++;
				}
				
			}
			
			if(count == 0) {
				
				System.out.println("Basarili bir sekilde username olusturdunuz");
			}else {
				
				System.out.println("Lütfen username icin alfabetik degerler giriniz!");
				System.out.println("Lütfen tekrar deneyiniz");
				
			}
			
		}else {
			System.out.println("Username length i yetersizdir!");
			System.out.println("Lütfen tekrar deneyiniz!");
		}
		
		
		

	}

}
