package okul2;

import java.util.Scanner;

public class Müdür {
	
	private String adSoyad;
	private int sifre;
	private int tcNo;
	private String adres;
	
	

	public Müdür(String adSoyad, int sifre, int tcNo, String adres) {
		this.adSoyad = adSoyad;
		this.sifre = sifre;
		this.tcNo = tcNo;
		this.adres = adres;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	public void bilgiMüdür() {
		
		System.out.println("___________________________________________");
		System.out.println("100. Yil Ilkögretim Okulu Müdür Bilgileri");
		System.out.println();
		System.out.println("***KISISEL BILGILER***");
		System.out.println("Ad Soyad: "+adSoyad.toUpperCase());
		System.out.println("Kimlik Numarasi: "+tcNo);
		System.out.println("Adres: "+adres);
		System.out.println("___________________________________________");
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
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sifre giriniz: ");
		int str = scanner.nextInt();
		int pass = 1234;
		
		
		
		if(pass==str) {
			
			this.sifre=sifre;
			
			
		}
		
		
		this.sifre = sifre;
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
