package Day02;

import java.util.Scanner;

public class Alistirma03GüzelSoruSifreleme {

	public static void main(String[] args) {
		
		/* 
        scanner kullanarak aşağıdaki sorulara cevaplar isteyiniz
        1.Adım: 3 adet String tanımlayınız. ad, soyad, rapor
        2.Adım: 2 adet integer tanımlayınız  doğum yılı, şimdiki yıl
        3.Adım: Kullanıcıdan; "Lütfen adınızı ve soy adınızı giriniz:" isteyin
                 Harun
                 Ekinci
        4.Adım: Kullanıcıdan;"Lütfen doğum yılınızı ve şimdiki yılı giriniz:" isteyin
                 1983
                 2020        
        5.Adım Raporu aşağıdaki gibi yazdırınız      
                "Adınız: Harun, Soy adınız: Ekinci, Yaşınız: 37"
        6. Adım: Yaşınız,Adınızın ilk harfi, soyadınızın ilk ve son harfi, isim ve soyisim karakter 
        		 uzunluklarını içeren bir şifre oluşturunuz
           //Şifre= 37HEi56        
        */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Adiniz: ");
		String ad = scanner.next();
		System.out.print("Soyadiniz: ");
		String soyad = scanner.next();
		
		
		System.out.print("Dogum Yiliniz: ");
		int dogumYili = scanner.nextInt();
		System.out.print("Suanki yili giriniz: ");
		int suankiYil = scanner.nextInt();
		

		
		System.out.println("Adiniz: "+ad+" "+ "Soyadiniz: "+" "+soyad+" "+"Yasiniz: "+ (suankiYil-dogumYili));
		
		int yas = suankiYil-dogumYili;
		char a = ad.charAt(0);
		char b = soyad.charAt(0);
		char c =soyad.charAt(soyad.length()-1);
		int length = ad.length()+soyad.length();
		
		String yas1 = String.valueOf(yas);
		String length1 = String.valueOf(length);
		String sifre = yas1+a+b+c+length1;
		System.out.println(sifre);
		
		
		scanner.close();
		
		

	}

}
