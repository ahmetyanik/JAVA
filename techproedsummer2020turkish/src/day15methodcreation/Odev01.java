package day15methodcreation;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Odev01 {

	public static void main(String[] args) {
		// Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin ilk harﬂerini 
		// büyük diğer harﬂerini küçük harf olarak ekrana yazdıran programı yazınız.
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Adinizi ve Soyadinizi giriniz: ");
		String isim = scanner.nextLine()+" ";
		
		
		ilkHarfBüyük(isim);
		
	scanner.close();	
		
	}
	
		public static void ilkHarfBüyük(String isim) {
		
		isim.trim();
		int bosluk = isim.indexOf(' ');
		String ikinciIsim = isim.substring(bosluk+1);
		int ikinciBosluk = ikinciIsim.indexOf(' ');
		String ücüncüIsim = ikinciIsim.substring(ikinciBosluk+1);
		int ücüncüBosluk = ücüncüIsim.indexOf(' ');
		String dördüncüIsim = ücüncüIsim.substring(ücüncüBosluk+1);
		

	
		if(dördüncüIsim.contains(" ")) {
			
				System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1,bosluk).toLowerCase()+" "+
		ikinciIsim.substring(0,1).toUpperCase()+ikinciIsim.substring(1, ikinciBosluk).toLowerCase()+" "+
		ücüncüIsim.substring(0,1).toUpperCase()+ücüncüIsim.substring(1,ücüncüBosluk).toLowerCase()+" "+
		dördüncüIsim.substring(0, 1).toUpperCase()+dördüncüIsim.substring(1).toLowerCase()); // 4 isim			
			
		}else if(ücüncüIsim.contains(" ")) {
			
			System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1,bosluk).toLowerCase()+" "+
			ikinciIsim.substring(0,1).toUpperCase()+ikinciIsim.substring(1, ikinciBosluk).toLowerCase()+" "+
			ücüncüIsim.substring(0,1).toUpperCase()+ücüncüIsim.substring(1,ücüncüBosluk).toLowerCase());  //3 isim
				
				
		}else if(ikinciIsim.contains(" ")) {
			
			System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1,bosluk).toLowerCase()+" "+
			ikinciIsim.substring(0,1).toUpperCase()+ikinciIsim.substring(1, ikinciBosluk).toLowerCase());//2 isim
			
		}else{
			System.out.println(("Lütfen en az bir soyisim giriniz!"));	
		}
	}
}
