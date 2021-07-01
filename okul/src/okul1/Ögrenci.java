package okul1;

import java.util.ArrayList;
import java.util.List;

public class Ögrenci {
	
	 static String adSoyad ;
	 public int sifre;
	 private int tcNo;
	 private String adres;
	 private int matematik;
	 private int türkce;
	 private int tarih;
	
	
	public Ögrenci(String adSoyad, int sifre, int tcNo, String adres, int matematik, int türkce, int tarih){
		this.adSoyad = adSoyad;
		this.sifre = sifre;
		this.tcNo = tcNo;
		this.adres = adres;
		this.matematik = matematik;
		this.türkce = türkce;
		this.tarih = tarih;
		
	}
	
	public void bilgiler() {
		
		
		System.out.println(adSoyad.toUpperCase());
		System.out.println();
		System.out.println("***NOTLAR***");
		System.out.println("Matematik: "+matematik);
		System.out.println("Türkce: "+ türkce);
		System.out.println("Tarih: "+tarih);
		System.out.println();
		System.out.println("***KISISEL BILGILER***");
		System.out.println("Kimlik Numarasi: "+tcNo);
		System.out.println("Adres: "+adres);
		
		
		
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

	/**
	 * @return the matematik
	 */
	public int getMatematik() {
		return matematik;
	}

	/**
	 * @param matematik the matematik to set
	 */
	public void setMatematik(int matematik) {
		this.matematik = matematik;
	}

	/**
	 * @return the türkce
	 */
	public int getTürkce() {
		return türkce;
	}

	/**
	 * @param türkce the türkce to set
	 */
	public void setTürkce(int türkce) {
		this.türkce = türkce;
	}

	/**
	 * @return the tarih
	 */
	public int getTarih() {
		return tarih;
	}

	/**
	 * @param tarih the tarih to set
	 */
	public void setTarih(int tarih) {
		this.tarih = tarih;
	}



	


}

