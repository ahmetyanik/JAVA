package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Alistirma08 {

	public static void main(String[] args) {
		// iki arayimiz var, iki arrayimizin ilk veya son degerlerini karşılaştırıyoruz.
		//herhangi biri ayni ise "true" değilse "false".
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen birinci arrayinizin öge sayisini giriniz: ");
		int adet = scanner.nextInt();		
		String arr1[] = new String[adet];
		int i=0;
		
		for(i=0; i<adet;i++) {
			
			arr1[i]=scanner.next();
		}	
		
		
		System.out.print("Lütfen ikinci arrayinizin öge sayisini giriniz: ");
		int adet2 = scanner.nextInt();		
		String arr2[] = new String[adet2];
		
		for(i=0; i<adet2;i++) {
			
			arr2[i]=scanner.next();
		}

		
		if(arr1[0].equals(arr2[0])||(arr1[arr1.length-1].equals(arr2[arr2.length-1]))) {
			
			System.out.println("true");
		}else {
			
			System.out.println("false");
			
		}
		
			
	
		
	}

}
