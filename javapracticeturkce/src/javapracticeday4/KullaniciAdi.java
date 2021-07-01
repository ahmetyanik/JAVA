package javapracticeday4;

import java.util.Scanner;

public class KullaniciAdi {

	public static void main(String[] args) {

		/*	Yeni bir class olusturunuz adi
		 LoopIfStatementsAndIncrementDecrement olsun
		 bir userName (kullanici adi)olusturunuz ve onun ozellikleri 
		 sirasi ile soyle olmalidir;
		 1_uzunlugu => en az 8 karakter (chars) olmalidir
		 2_icinde sadece alfabetik karakterler bulunmalidir*/
		
		Scanner scanner = new Scanner(System.in);
		int count2=3;
		while(count2>=0) {
		System.out.print("Bir kullanici adi olusturunuz: ");
		String userName = scanner.next().toLowerCase();
		
		int count =0;		
		
		
		if(userName.length()>=8) {
			
			for(int i =0; i<userName.length();i++) {
				
				if(!(userName.charAt(i)>='a' &&  userName.charAt(i)<='z')) {
					
					count++;
					
				}				
			}
			
			if (count>0) {
				System.out.println("Lütfen alfabetik degerler giriniz!");
				count2--;
		}else {
			System.out.println("Basarili bir sekilde username olusturdunuz...");
			break;
		}
		

		}else {
			
			System.out.println("Lütfen en az 8 karakter giriniz!");
			count2--;
			
		}
		
		
		}if(count2<0) {
			System.out.println("Username olusturma hakkiniz kalmamistir!");
		}
		
		
	}

}
