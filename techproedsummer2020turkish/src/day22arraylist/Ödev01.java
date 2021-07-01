package day22arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Ödev01 {

	public static void main(String[] args) {

//		For-each loop Soru 1: Bir integer array oluşturunuz ve bu array’deki tum 
//		sayıların çarpımını For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("5 adet tamsayi giriniz: ");
		
		
		int arr[] = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(i+1+". sayi: ");
			arr[i]=scanner.nextInt();
		}
		
		int carpim =1;
		
		for(int w:arr) {
			
			carpim*=w;
		}
		System.out.println("Sayilarin carpimi: "+carpim);

	}

}
