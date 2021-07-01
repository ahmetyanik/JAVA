package day16overloading;

import java.util.Scanner;

public class Hesap {

	Scanner scanner = new Scanner(System.in);
	String adSoyad;
	String hesapNo;
	int bakiye;
	
	
	Hesap(String adSoyad, String hesapNo, int bakiye){
		
		this.adSoyad = adSoyad;
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;		
		
	}
	public void bilgileriGöster(){
	
		String sifre;
		String gercekSifre;
		int girisHakki = 3;
		int ikinciGirisHakki = 3;
		String arkadasAdi = "seyfi";
		
	
		while(girisHakki>0) {
		System.out.print("Sifreyi giriniz: ");
		sifre = scanner.nextLine();
		gercekSifre = "1234";
		String arkAdi = null;
		
		if(sifre.equals(gercekSifre)) {
			
			System.out.println("Ad      : "+adSoyad);
			System.out.println("Hesap No: "+hesapNo);
			System.out.println("Bakiye  : "+bakiye);
			System.out.println("*********************");			
			break;
			
		}
		girisHakki --;
		
		 	if(girisHakki==0) {
			
		
			while(ikinciGirisHakki>0) {
				
				Scanner scanner = new Scanner(System.in);
				System.out.print("Arkadasinizin adini giriniz: ");
				arkAdi = scanner.nextLine().toLowerCase();
				
				if (arkAdi.equals(arkadasAdi)) {
					
					System.out.println("Ad      : "+adSoyad);
					System.out.println("Hesap No: "+hesapNo);
					System.out.println("Bakiye  : "+bakiye);
					System.out.println("*********************");
					break;
					
				}ikinciGirisHakki --;
				
				if (ikinciGirisHakki ==0) {
					
					System.out.println("Giris Hakkiniz Bulunmamaktadir!");
				}	
				}	
			}	
		 	}  
		}	
		
	
	public static void main(String[] args) {
		
		Hesap ahmetYanik = new Hesap("Ahmet Yanik","123456789",1000);
		Hesap zeynepduruYanik = new Hesap("Zeynep Duru Yanik","123456789",200);
		Hesap ayseYanik = new Hesap("Ayse Yanik","123456789", 2000);
		
		
		ayseYanik.bilgileriGöster();
	
	}
	
		}
