package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Iki array olusturup bu arraylerin birbirine esit olup olmadigini kontrol ediniz:
		
		//NOT: Iki arrayin esit olabilmesi icin 3 sartimiz vardir:
		//     1) Elemanlar ayni olmali
		//     2) Esit elemanlarin indexleri de esit olmali
		//     3) Adresleri esit olmali
		
		
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		System.out.println(arr1==arr2);//cikti:false cünkü reference'lar farkli
									   // "==" adresleri de kontrol eder ve
		//iki array farkli iki obje oldugu icin referencelari da farklidir
		
		//adresleri gözardi etmek icin yani sadece degerler ve indexleri kontrol etmek icin;
		
		System.out.println(Arrays.equals(arr1, arr2)); //cikti: true

	}

}
