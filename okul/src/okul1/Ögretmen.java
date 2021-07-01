package okul1;

import java.util.Scanner;

public class Ögretmen {
	
	static Scanner scanner = new Scanner(System.in); 

	private String adSoyad ;
	private int sifre;
	private String kidemNot;
	private int tcNo;
	private String adres;	
	
	public Ögretmen(String adSoyad, int sifre, String kidemNot, int tcNo, String adres) {
		
		this.adSoyad = adSoyad;
		this.sifre = sifre;
		this.kidemNot = kidemNot;
		this.tcNo = tcNo;
		this.adres = adres;
		
		
	}
	
	public static void bilgilerÖgretmen() {
		
		System.out.println(adSoyad.toUpperCase());
		System.out.println();
		System.out.println("***KISISEL BILGILER***");
		System.out.println("Kimlik Numarasi: "+tcNo);
		System.out.println("Adres: "+adres);
		System.out.println("Kidem Notu: "+kidemNot);
		
	}
	
	public void ögrenciBilgileriGör() {
		
		System.out.println("Ögrencinin Adini Giriniz: ");
		String s1 = scanner.nextLine();
		
		if(s1.equals(Ögrenci.adSoyad)) {
			
			System.out.println("Ögrencinizin Bilgileri: ");
			System.out.println(Ögrenci.adSoyad);
			System.out.println("NOTLAR");
			System.out.println(Ögrenci.türkce);
			System.out.println(Ögrenci.matematik);
			System.out.println(Ögrenci.tarih);
			
			
		}else {
			
			System.out.println("Ögrenci adi hatali");
		}
	}
	
	 
		
		
	}

		

	


