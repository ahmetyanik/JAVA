package day22arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
//		İki String array oluşturunuz ve bu array’lerdeki ortak elemanları 
//		For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.  
//		Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırını

		List<String> liste1 = new ArrayList<>();
		List<String> liste2 = new ArrayList<>();
		List<String> liste3 = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Array'e atamak üzere Array1'in elemanlarini giriniz: ");
		System.out.println("Yeterli elemana ulasinca 'q' giriniz!");
		
		String islem= "";
		String islem1="";

		
		
		while(!(islem.equals("q"))) {
			
			System.out.print("Eleman giriniz: ");
			islem= scanner.nextLine();
			liste1.add(islem);
			
		}liste1.remove(liste1.size()-1);
		
		String arr[] = liste1.toArray(new String[0]); 
		
		
		
		System.out.println("Array'e atamak üzere Array2'in elemanlarini giriniz: ");
		System.out.println("Yeterli elemana ulasinca 'q' giriniz!");
			
	
		while(!(islem1.equals("q"))) {
			
			System.out.print("Eleman giriniz: ");
			islem1= scanner.nextLine();
			liste2.add(islem1);
			
		}liste2.remove(liste2.size()-1);
		
		String arr2[] = liste2.toArray(new String[0]); 
		
		
		for(String w : arr) {
			for(String z : arr2) {
				
				if(w.equals(z)) {
					
				liste3.add(w);

				
				}
				
			}
			
				
		}	
			
			if(liste3.size()==0) {
				
				System.out.println("Ortak eleman bulunmamaktadir.");
			}else {
				System.out.println("Ortak elemanlar: " +liste3);
			}
					
	}
		
		
	}


