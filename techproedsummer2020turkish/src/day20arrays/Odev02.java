package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		/*Kullanıcıya kaç elemanlı bir array gireceğini sorun.  
		Kullanıcıdan array’in elemanlarını girmesini isteyin. 
		a) Bu array’in icinde herhangi bir elemanın var olup olmadigini kontrol edin. 
		b) Bu arayın tum elemanlarını tersten yazdırın.       
		Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdırın.*/
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kac elemanli bir array olusturacaksiniz?: ");
		int adet = scanner.nextInt();
		String arr[] = new String[adet];
		
		
		for(int i=0; i<arr.length;i++) {
			
			System.out.print((i+1)+".nci elemani giriniz: ");
			arr[i]=scanner.next();
		}
		
		
		System.out.print("Array'de hangi elemani aramak istiyorsunuz?:");
		String aranan = scanner.next();
		int x=0;		
			
			x = Arrays.binarySearch(arr, aranan);
		
		if(x>0) {
			System.out.println(aranan+" bu arrayde bulunmaktadir.");
			
		}else {
			
			System.out.println(aranan+" bu arrayde bulunmamaktadir!");
			
		}
		System.out.println("*****************************************");
		String yeni[] = new String[arr.length];
		
		for(int i=0; i<adet;i++) {
			
			yeni[i]=arr[adet-1-i];
			
		}
		
		System.out.println("Önceki: "+Arrays.toString(arr));
		System.out.println("Sonraki: "+Arrays.toString(yeni));
		
		
	}

}
