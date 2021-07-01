package silebilirsin2;

import java.util.Scanner;

public class Yönetici extends Calisanlar {

	private String sorumluOlduguKisiSayisi;

	public Yönetici(String isim,String tcNo,String dogumYeri,String dogumTarihi,String departman,String sorumluOlduguKisiSayisi) {
		super(isim, tcNo, dogumYeri, dogumTarihi, departman);
		this.sorumluOlduguKisiSayisi = sorumluOlduguKisiSayisi;
		
		
		
	}

	public String getSorumluOlduguKisiSayisi() {
		return sorumluOlduguKisiSayisi;
	}

	public void setSorumluOlduguKisiSayisi(String sorumluOlduguKisiSayisi) {
		this.sorumluOlduguKisiSayisi = sorumluOlduguKisiSayisi;
	}
	
	public void bilgileriGöster() {
		
		while (true) {
		
		int sifre = 123;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen Sifreyi Giriniz: ");
		int sayi = scanner.nextInt();
		
		
		if (sifre == sayi)	{	
		
		
		System.out.println("Yöneticinin Adi: "+isim);
		System.out.println("Yöneticinin TC Numarasi: "+tcNo);
		System.out.println("Yöneticinin Dogum Yeri: "+dogumYeri);
		System.out.println("Yöneticinin Dogum Tarihi: "+dogumTarihi);
		System.out.println("Yöneticinin Departmani: "+departman);
		System.out.println("Yöneticinin Sorumlu Oldugu Calisan Sayisi: "+sorumluOlduguKisiSayisi);
		
		break;
		}
		else {
			
			System.out.println("Giris yetkiniz bulunmamaktadir...");
			
		}
			
	}}
		
	}
	

	
	


