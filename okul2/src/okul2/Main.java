package okul2;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ögrenci aliAkyurt = new Ögrenci("Ali Akyurt",1234, 987654321,"Kizilay mah. 131 sokak Asagi Ayranci/Ankara",78,83,99);		
		Ögrenci ayhanAkman = new Ögrenci("Ayhan Akman",2345,987538393,"Anadolu mah. 234 sokak Yukari Ayranci/Ankara",34,76,100);
		Müdür unalAysal = new Müdür("Unal Aysal",3456,897654356,"Florya mah. 546 sokak Üsküdar/Istanbul");
		Ögretmen fatihTerim = new Ögretmen("Fatih Terim",6789,"Iyi",908765432,"Gazi mah. 987 sokak Kozan/Adana");
		Ögretmen muratUcar = new Ögretmen("Murat Ucar",1235, "Kötü", 858585858, "Ankara-Ulus");
		Ögrenci ahmetYanik = new Ögrenci("Ahmet Yanik",123,978797979,"Berlin",34,56,78);
		
		
		Scanner scanner = new Scanner(System.in);
		
		String kulAdi;
		String camelKulAdi;
		int sifre;
		int count = 0;
		String islem="";
		int giris = 0;
	
	
		
		
			System.out.print("Lütfen Kullanici Adinizi Giriniz: ");
			kulAdi = scanner.nextLine();
			kulAdi = kulAdi.trim();
			int bosluk = kulAdi.indexOf(" ");
			kulAdi = kulAdi.substring(0,bosluk).toLowerCase()+kulAdi.substring(bosluk);
			kulAdi = kulAdi.replace(" ","");
			
			System.out.print("Lütfen Sifrenizi Giriniz: ");
			sifre = scanner.nextInt();
			
			
			
				
			
						
		}
		
		}
		
	
