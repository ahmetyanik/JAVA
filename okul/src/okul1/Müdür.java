package okul1;

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
	
	public static void bilgiMüdür(){
		
		System.out.println(Müdür);
		System.out.println();

		System.out.println("***KISISEL BILGILER***");
		System.out.println("Kimlik Numarasi: "+tcNo);
		System.out.println("Adres: "+adres);		
		
	}
	
	public void notGir() {
		
		System.out.println("Ögrencinin adini giriniz: ");
		String ögAd = Scanner.nextLine();
		
		if(ögAd.equals(Ögrenci.adSoyad)) {
			
			
			System.out.println("Not giriniz: ");
			int not = scanner.nextInt();
			Ögrenci.matematik = not;
			
			System.out.println(Ögrenci.adSoyad+" yeni notu "+not+" basariyla kaydedilmistir.");
		}
		
		
	}

	/**
	 * @return the adSoyad
	 */
	public String getAdSoyad() {
		return adSoyad;
	}

	/**
	 * @param adSoyad the adSoyad to set
	 */
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	/**
	 * @return the sifre
	 */
	public int getSifre() {
		return sifre;
	}

	/**
	 * @param sifre the sifre to set
	 */
	public void setSifre(int sifre) {
		this.sifre = sifre;
	}

	/**
	 * @return the tcNo
	 */
	public int getTcNo() {
		return tcNo;
	}

	/**
	 * @param tcNo the tcNo to set
	 */
	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}

	/**
	 * @return the adres
	 */
	public String getAdres() {
		return adres;
	}

	/**
	 * @param adres the adres to set
	 */
	public void setAdres(String adres) {
		this.adres = adres;
	}

	
	
}