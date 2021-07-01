package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		/*Kullanıcıya kaç elemanlı bir array gireceğini sorun.  
		Kullanıcıdan array’in elemanlarını girmesini isteyin. 
		a) Bu array’in tum elemanlarını ekrana yazdırın. 
		b) Bu arayın son elemanını ilk eleman yapın ve tum elemanlarını ekrana yazdırın.       
		Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdırın*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kac elemanli bir array gireceksiniz: ");
		int adet = scanner.nextInt();
		String arr[]=new String[adet];
		
		for(int i=0; i<adet;i++) {
				System.out.print((i+1)+".nci elemani giriniz: ");
				arr[i]= scanner.next();
			
		}
		
		String arrYeni[] = new String[arr.length];
		arrYeni[0]=arr[arr.length-1];
		arrYeni[arr.length-1]=arr[0];
		
		for(int j =1;j<(arr.length)-1;j++) {
			
			arrYeni[j] = arr[j]; 
		}
		
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrYeni));
	}

}
