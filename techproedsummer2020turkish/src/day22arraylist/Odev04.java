package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
//		Bir String oluşturunuz, bu String’deki character’leri 
//		yukarıdan aşağıya for-each loop kullanarak yazdırınız.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir kelime yada cümle giriniz: ");
		String str = scanner.nextLine();
		String arr[] = str.split("");
		
	
		for(String w: arr) {
			
			System.out.println(w);
				
				
			}	

	}

}
