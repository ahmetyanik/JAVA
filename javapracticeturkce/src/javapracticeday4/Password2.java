package javapracticeday4;

import java.util.Scanner;

public class Password2 {

	public static void main(String[] args) {


		/*
		bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
		1_ uzunlugu => en az 10 karakter(chars) olmalidir
		2_en az 1 sembol bulundurmali
		3_en az 1 numara bulundurmali
		4_en az bir buyuk harf olmalidir
		5_en az bir kucuk harf olmalidir
		*/
		
		String sembol = "!§$%&/()=*+'#";
		int sembolSayisi = 0;
		String rakam = "0123456789";
		int rakamSayisi = 0;
		int kücükHarfSayisi = 0;
		int büyükHarfSayisi = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sifre olusturunuz: ");
		String sifre = scanner.next();
		
		if(sifre.length()>=10) {
			
			for(int i =0; i<sifre.length();i++) {
				
				if(sembol.contains(sifre.substring(i, i+1))) {
					sembolSayisi ++;					
				}
				if(rakam.contains(sifre.substring(i,i+1))) {
					rakamSayisi++;
					
				}
				if(sifre.charAt(i)>='a'&&sifre.charAt(i)<='z') {
					kücükHarfSayisi++;
				}
				if(sifre.charAt(i)>='A'&&sifre.charAt(i)<='Z') {
					büyükHarfSayisi++;
				}}
			
			if(sembolSayisi>0) {
				
				if(rakamSayisi>0) {
					
					if(kücükHarfSayisi>0) {
						
						if(büyükHarfSayisi>0) {
							
							System.out.println("Tebrikler sifreniz olustu...");
						}else {
							System.out.println("Büyük harf kullanmaniz gerekmektedir...");
						}
					}else {
						System.out.println("Kücük harf kullanmaniz gerekmektedir");
					}
				}else {
					System.out.println("Rakam kullanmaniz gerekmektedir...");
				}
			}else {
				System.out.println("Sembol kullanmaniz gerekmektedir...");
			}
			
			
			
			
			
			}else {
			System.out.println("Lütfen en az 10 karakterli bir sifre olusturunuz!");
		}
		
		System.out.println(sembolSayisi);
		System.out.println(rakamSayisi);
		System.out.println(kücükHarfSayisi);

	}

}
