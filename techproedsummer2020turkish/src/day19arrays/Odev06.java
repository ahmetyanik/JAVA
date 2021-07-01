package day19arrays;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		
//		Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol  
//		eden bir program yazınız.Aynı eleman varsa “Aynı eleman var” yoksa  
//		“Aynı eleman yok” yazdırınız
		
		int x [] = arrayYap();
		
		kontrol(x);
		
		
		
		
	}
	public static int[] arrayYap(){
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kac adet öge gireceksiniz?: ");
		int adet = scanner.nextInt();		
	
		
		int i = 0;
		System.out.print("Ögelerinizi giriniz: ");
		int array[] = new int [adet];
		
		while(i<adet) {
			array[i]= scanner.nextInt();
			i++;
			
		}
		return array;		
		
		
	}
	public static void göster(int array[]) {
		
		for(int i=0;i<array.length;i++) {
			
			System.out.println(array[i]);
		}
	}
	
	public static void kontrol(int array[]) {
		
		int count =0;
		for(int i=0;i<array.length;i++) {
			
			for(int j =i+1;j<array.length;j++) {
				
				if(array[i]==array[j]) {
					
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


