package silebilirsin2;

import java.util.Scanner;

public class Calisanlar {
	
	protected String isim;
	protected String tcNo;
	protected String dogumYeri;
	protected String dogumTarihi;
	protected String departman;
	
	


	
	public Calisanlar(String isim, String tcNo, String dogumYeri, String dogumTarihi, String departman) {
		
		this.isim = isim;
		this.tcNo = tcNo;
		this.dogumYeri = dogumYeri;
		this.dogumTarihi = dogumTarihi;
		this.departman = departman;		
		
		
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {	
		this.isim = isim;
}
	
	public void getTcNo() {
	
		int sifre =123;
		System.out.println("TC Numarasini görebilmek icin izniniz var mi?"+
							"Lütfen sifreyi giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		
		
			if (sayi!=sifre) {
			
			System.out.println("Bu bilgiyi görme yetkiniz bulunmamaktadir.");
		
			
			}
			else {
			
				System.out.println(tcNo);
				
			return;
			
			}}
		
			
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getDogumYeri() {
		return dogumYeri;
	}
	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}
	public String getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public String getDepartman() {
		return departman;
	}
	public void setDepartman(String departman) {
		this.departman = departman;
	}
	
	public void bilgileriGöster() {
		
		System.out.println("Calisanin Adi         : "+isim);
		System.out.println("Calisanin TC Numarasi : "+tcNo);
		System.out.println("Calisanin Dogum Yeri  : "+dogumYeri);
		System.out.println("Calisanin Dogum Tarihi: "+dogumTarihi);
		System.out.println("Calisanin Departmani  : "+departman);
		
	}
	
	

}
