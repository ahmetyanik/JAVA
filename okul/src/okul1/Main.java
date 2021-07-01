package okul1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		
		
		
		Ögrenci ögrenci1 = new Ögrenci("Ali Akyurt",1234, 987654321,"Kizilay mah. 131 sokak Asagi Ayranci/Ankara",78,83,99);		
		Ögrenci ögrenci2 = new Ögrenci("Ayhan Akman",2345,987538393,"Anadolu mah. 234 sokak Yukari Ayranci/Ankara",34,76,100);
		Müdür müdür = new Müdür("Unal Aysal",3456,897654356,"Florya mah. 546 sokak Üsküdar/Istanbul");
		Ögretmen ögretmen = new Ögretmen("Fatih Terim",6789,"Iyi",908765432,"Gazi mah. 987 sokak Kozan/Adana");
		Ögretmen ögretmen2 = new Ögretmen("Murat Ucar",1235, "Kötü", 858585858, "Ankara-Ulus");
		Ögrenci ögrenci3 = new Ögrenci("Ahmet Yanik",123,978797979,"Berlin",34,56,78);
		
		
		
		System.out.println(ögrenci1.adSoyad);
		System.out.println(Ögrenci.adSoyad);
		System.out.println(ögrenci1.sifre);
		System.out.println(ögrenci2.sifre);
		
		
	
		Scanner scanner = new Scanner(System.in);
		
		String kulAdi;
		int sifre;
		int count = 0;
		String islem="";
		
		

						
			
			/*if(kulAdi.equals(ögrenci1.getAdSoyad()) && (sifre == ögrenci1.getSifre() )) {
				
				System.out.println("Giris Basarili...");
				System.out.println();
				((Ögrenci) ögrenci1).bilgiler();
				count ++;
				System.out.println();
				break;
			
			}else if(kulAdi.equals(müdür.adSoyad) && sifre == Müdür.sifre ) {				
				
				System.out.println("Giris Basarili...");
				System.out.println();
				Müdür.bilgiMüdür();
				count +=2;
				System.out.println();
				break;
				
			}else if(kulAdi.equals(Ögretmen.adSoyad) && sifre == Ögretmen.sifre )	{
				
				System.out.println("Giris Basarili...");
				System.out.println();
				Ögretmen.bilgilerÖgretmen();
				System.out.println();
				count +=3;
				System.out.println();
				break;
				
			}else {
				
				System.out.println("Hatali giris Yaptiniz!");
			}
			
			
		}
			if(count==1) {				
				System.out.print("Sevgili Ögrencimiz "+ögrenci1.adSoyad+" lütfen yapmak istediginiz islemi seciniz: ");
				
			}else if(count==2) {				
				System.out.println("*****MEB YÖNETICI PORTALI*****");
				System.out.println("Sayin "+Müdür.adSoyad+" lütfen yapmak istediginiz islemi seciniz: ");
				
			}else if(count==3) {
				System.out.println(("*****MEB ÖGRETMEN PORTALI*****"));
				System.out.println("Sayin "+Ögretmen.adSoyad+" lütfen yapmak istediginiz islemi seciniz: ");
				
				
			
					
				}*/
				
			}

	}





