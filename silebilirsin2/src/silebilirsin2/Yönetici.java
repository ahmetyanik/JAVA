package silebilirsin2;

import java.util.Scanner;

public class Y�netici extends Calisanlar {

	private String sorumluOlduguKisiSayisi;

	public Y�netici(String isim,String tcNo,String dogumYeri,String dogumTarihi,String departman,String sorumluOlduguKisiSayisi) {
		super(isim, tcNo, dogumYeri, dogumTarihi, departman);
		this.sorumluOlduguKisiSayisi = sorumluOlduguKisiSayisi;
		
		
		
	}

	public String getSorumluOlduguKisiSayisi() {
		return sorumluOlduguKisiSayisi;
	}

	public void setSorumluOlduguKisiSayisi(String sorumluOlduguKisiSayisi) {
		this.sorumluOlduguKisiSayisi = sorumluOlduguKisiSayisi;
	}
	
	public void bilgileriG�ster() {
		
		while (true) {
		
		int sifre = 123;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("L�tfen Sifreyi Giriniz: ");
		int sayi = scanner.nextInt();
		
		
		if (sifre == sayi)	{	
		
		
		System.out.println("Y�neticinin Adi: "+isim);
		System.out.println("Y�neticinin TC Numarasi: "+tcNo);
		System.out.println("Y�neticinin Dogum Yeri: "+dogumYeri);
		System.out.println("Y�neticinin Dogum Tarihi: "+dogumTarihi);
		System.out.println("Y�neticinin Departmani: "+departman);
		System.out.println("Y�neticinin Sorumlu Oldugu Calisan Sayisi: "+sorumluOlduguKisiSayisi);
		
		break;
		}
		else {
			
			System.out.println("Giris yetkiniz bulunmamaktadir...");
			
		}
			
	}}
		
	}
	

	
	


