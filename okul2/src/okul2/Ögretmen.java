package okul2;

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
	
	public void bilgilerÖgretmen() {
		
		System.out.println("___________________________________________");
		System.out.println("100. Yil Ilkögretim Okulu Ögretmen Bilgileri");
		System.out.println();
		System.out.println("***KISISEL BILGILER***");
		System.out.println("Ad Soyad: "+ adSoyad.toUpperCase());
		System.out.println("Kimlik Numarasi: "+tcNo);
		System.out.println("Adres: "+adres);
		System.out.println("Kidem Notu: "+kidemNot);
		System.out.println("___________________________________________");
	}
	
	public void ögrenciBilgileriGör() {
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Scanner getScanner() {
		return scanner;
	}

	public static void setScanner(Scanner scanner) {
		Ögretmen.scanner = scanner;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public int getSifre() {
		return sifre;
	}

	public void setSifre(int sifre) {
		this.sifre = sifre;
	}

	public String getKidemNot() {
		return kidemNot;
	}

	public void setKidemNot(String kidemNot) {
		this.kidemNot = kidemNot;
	}

	public int getTcNo() {
		return tcNo;
	}

	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

}
