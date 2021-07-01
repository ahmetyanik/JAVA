package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		//For Each Loop, for loop'un üst versiyonudur. 
		//Diger adi "Enhanced(Zenginlestirilmis) Loop"tur.
		
		int arr[] = {12,21,13,43};
		
		
		//for loop kullanarak elemanlari ekrana yazdirmak
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]);
			
		}
		System.out.println();
		//for each loop kullanarak elemanlari ekrana yazdirmak
		
		for(int w : arr) {
			
			System.out.print(w);
		}
		System.out.println();
		//String iceren bir array olusturun elemanlarini yanyana aralarina bosluk koyarak 
		//for each loop ile ekrana yazdirin
		
		String arr1[] = {"Ahmet","Ayse","Zeynep"};
		
		for(String w : arr1) {
			
			System.out.print(w+" ");
		}
		
		//Integer elemanlar veren bir List olusturun. For each loop kullanarak bu elemanlarin toplamaini
		//ekrana yazdirin
		
		
		List<Integer> liste1 = new ArrayList<>();
		
		liste1.add(1);
		liste1.add(2);
		liste1.add(3);
		
		int sum=0;
		for(int w:liste1 ) {
			
			sum +=w;
			
		}
		System.out.println(sum);
		
		//{{1,2},{5},{6,7,8}} arrayindeki tüm elemanlarin toplamini bulunuz
		
		int arr2 [][] = {{1,2},{5},{6,7,8}};
		
		int sum2=0;
		
		for(int[] w: arr2) {
			
			for(int y: w) {
				
				sum2 += y;
			}
			
		}System.out.println(sum2);		

	}

}
