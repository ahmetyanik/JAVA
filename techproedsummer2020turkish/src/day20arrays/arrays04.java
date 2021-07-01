package day20arrays;

import java.util.Arrays;

public class arrays04 {

	public static void main(String[] args) {
		//Bir arrayin icinde belli bir elemanin var olup olmadigini kontrol ediniz
		//binarySearch() methodu bu is icin kullanilir
		//bineraySearch() methodu aranan eleman varsa o elemanin indeksini return eder
		
		//ÖNEMLI NOT: binarySearch() methodunu kullanmadan önce sort() methodunu
		//kullanmak zorundayiz. Aksi takdirde binarySearch() methodu manali bir
		//sonuc vermez
		
		int arr[]= {1,5,2,4,3};
		
		//Yukarida verilen array'de 3 eleman olarak var mi?
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 3));//sonucu ilk önce sort edecek yani siralayacak
														//sonra da indexteki yerini verecek
		
		//ayni elemandan birden fazla oldugunda ilkinin indexini verir
	
		System.out.println(Arrays.binarySearch(arr, 5));
		
		//ayni elemandan birden fazla oldugunda ilkinin indexini verir		
		int arr2[]= {1,5,12,12,2,4,3};
		
		Arrays.sort(arr2);
		System.out.println(Arrays.binarySearch(arr2, 2));
		
		//binarySearch() methodu olmayan elemanlar icin negatif sayilar return eder
		//var olsaydi kacinci ELEMAN olmasi gerektigini önüne -(eksi) koyarak gösterir
		
		Arrays.sort(arr2);
		System.out.println(Arrays.binarySearch(arr2, 8));
		

	}

}
