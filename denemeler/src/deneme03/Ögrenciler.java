package deneme03;

import java.util.Scanner;

class Ögrenciler {
	
	private String adSoyad;
	private int okulNo;
	private int tcNo;
	private String adres; 
	
	
	
	public Ögrenciler(String adSoyad,int okulNo,int tcNo,String adres) {
		this.adSoyad=adSoyad;
		this.okulNo=okulNo;
		this.tcNo=tcNo;
		this.adres=adres;
		
	}
	
	
	public void bilgiler() {
		
		int sifre = 1234;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sifre giriniz: ");
		int pass = scanner.nextInt();
		
		if(sifre==pass) {
		
			System.out.println("Bilgiler");
			System.out.println("Ögrencinin ad soyadi    :"+adSoyad);
			System.out.println("Ögrencinin okul numarasi:"+ okulNo);
			System.out.println("Ögrencinin TC Numarasi  :"+tcNo);
			System.out.println("Ögrencinin adresi       :"+ adres);
			
		}else {
			System.out.println("Hatali sifre!");
		}
		
	}
	
	
	

	public String getAdSoyad() {
		return adSoyad;
	}



	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}



	public int getOkulNo() {
		return okulNo;
	}



	public void setOkulNo(int okulNo) {
		this.okulNo = okulNo;
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



	public static void main(String[] args) {
		
		
		
		
		

	}

}
