package odev;

import java.util.Scanner;

public class Müsteriler {

	private String adSoyad;
	private int tcNo;
	private String adres;
	private boolean evli;
	
	
	public Müsteriler(String adSoyad, int tcNo, String adres, boolean evli) {
		this.adSoyad= adSoyad;
		this.tcNo=tcNo;
		this.adres=adres;
		this.evli=evli;
		
		
		
	}
	
	
	
	
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
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
	public boolean isEvli() {
		return evli;
	}
	public void setEvli(boolean evli) {
		this.evli = evli;
	}
	
	public void bilgiler(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sifre Giriniz: ");
		int pass= scanner.nextInt();
		int sifre = 1234;
		
		if(sifre==pass) {
			
			System.out.println("Kisi Bilgileri");
			System.out.println("Ad Soyad       :"+adSoyad);
			System.out.println("Kimlik Numarasi: "+tcNo);
			System.out.println("Adres          :"+adres);
			System.out.println("Medeni Hal     :"+evli);
			
		}else {
			System.out.println("Hatali sifre!");
		}
		
		

		
	}
	

}
