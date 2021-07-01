package deneme002;

import java.util.Scanner;

public class Müsteriler {

	private String adSoyad = "Ad Soyad";
	private int tcNo = 53535353;
	private String adres = "Berlin";
	private boolean evli = true;
	
	
	public Müsteriler(String adSoyad,int tcNo,String adres, boolean evli) {
		this.adSoyad=adSoyad;
		this.tcNo = tcNo;
		this.adres=adres;
		this.evli = evli;
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

	public void setAdres(String adres) {
		this.adres = adres;
	}
	public boolean isEvli() {
		
		return evli;
	
	}
	public void setEvli(boolean evli) {
		this.evli = evli;
	}
	
	public void bilgileriGöster() {
		
		int sifre = 1234;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen sifrenizi giriniz: ");
		int num = scanner.nextInt();
		
		if(sifre==num) {
			
			System.out.println("Ad Soyad: "+adSoyad);
			System.out.println("Tc Kimlik No: "+tcNo);
			System.out.println("Medeni Hal: " +evli);
			
		}else {
			System.out.println("Hatali sifre");
		}
		
		
		
		
	}
	
	public static void main (String []args) {
		
		
		
	
	}

}
