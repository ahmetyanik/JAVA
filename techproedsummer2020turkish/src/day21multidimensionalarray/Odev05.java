package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Odev05 {

	public static void main(String[] args) {
		//  1) Elemanları A, C, E, ve F olan bir String ArrayList oluşturup ekrana yazdırınız.
		
		List<String> liste = new ArrayList<>();
		
		liste.add("A");
		liste.add("C");
		liste.add("E");
		liste.add("F");
		
		System.out.println(liste);
		
//		2) İndexsiz add() methodunu kullanarak, B’yi ekleyiniz.  İndex’li add() 
//		methodunu kullanarak, L’yi 1 numaralı index’e ekleyiniz. ArrayList’i ekrana 
//		yazdırınız, list şöyle olmalı; A, L, C, E, F, B
		
		
		liste.add("B");
		liste.add(1, "L");
		System.out.println(liste);
		
//		3) set() methodu kullanarak, E’yi D yapınız.  ArrayList’i ekrana yazdırınız, 
//		list şöyle olmalı; A, L, C, D, F, B.
		
		liste.set(3, "D");
		System.out.println(liste);
		
//		4) remove() methodu kullanarak, F’yi siliniz. ArrayList’i ekrana 
//		yazdırınız, list şöyle olmalı; A, L, C, D, B
		
		liste.remove("F");
		System.out.println(liste);
		
//		5) sort() methodu kullanarak, elemanları alfabetik sıraya diziniz. ArrayList’i 
//		ekrana yazdırınız, list şöyle olmalı; A, B, C, D, L
		
		Collections.sort(liste);
		System.out.println(liste);
		
//		6) contains() methodu kullanarak, L’nin list’de var oldugunu 
//		ve M’nin list’de var olmadığını doğrulayınız.	
		
		System.out.println(liste.contains("L"));
		System.out.println(liste.contains("M"));
		
//		7) size() methodu kullanarak, list’in kaç eleman olduğunu ekrana yazdırınız
		
		System.out.println(liste.size());
		
//		8) clear() methodu kullanarak, list’deki tum elemanları siliniz	
		
		liste.clear();
		System.out.println(liste);
		
//		9) isEmpty() methodu kullanarak, list’deki tum elemanların silindiğini doğrulayınız.	
		
		boolean x = liste.isEmpty();
		
		System.out.println(x);
		
		
		
		

	}

}
