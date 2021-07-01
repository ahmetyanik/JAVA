package day19arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Odev7 {
	
	public static void main(String[] args) {
		
//		Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol  
//		eden bir program yazınız.Aynı eleman varsa “Aynı eleman var” yoksa  
//		“Aynı eleman yok” yazdırınız
		
		String x [] = arrayYap();
		
		kontrol(x);	
			
		
	}

	
	public static String[] arrayYap(){
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kac adet öge gireceksiniz?: ");
		int adet = scanner.nextInt();		
		
		
		int i = 0;
		System.out.println("Ögelerinizi istediginiz type'da giriniz: ");
		String array[] = new String [adet+1];
		
		while(i<adet+1) {
			array[i]= scanner.nextLine();
			i++;
			
		
		}
		

		return array;		
		
		
	}
	public static void göster(int array[]) {
		
		for(int i=0;i<array.length;i++) {
			
			System.out.println(array[i]);
		}
	}
	
	public static void kontrol(String array[]) {
		
		int i = 0;
		int j = 0;
		int count =0;
		String x = (String) array[i];
		String y = (String) array[j];
		
		for(i=0;i<array.length;i++) {
			
			for(j =i+1;j<array.length;j++) {
				
				x = array[i];
				y = array[j];
				
				if(x.equals(y)) {
					
					count ++;
				}
					
			}
		}
		if(count>0) {
			System.out.println("Ayni eleman var");
		}else {
			System.out.println("Ayni eleman yok");
		}
		
	}
	
	}


