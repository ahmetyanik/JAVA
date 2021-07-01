package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		// HashSet 1) Tekrarli eleman kullanimina (duplication) izin vermez
		//		   2) Key-Value yapisini kullanir. Key'ler ve value'lar 
		//		   HashSet icin mutlaka unique'tir(Normalde keyler her zaman unique
		//		   'tir value'lar kullanilan class'a bagli olarak unique olabilir veya
		//		   olmayabilir. Kullanilan class HashSet ise value'lar da unique olur ama
		//		   ArrayList ise unique olma zorunlulugu yoktur
		
		HashSet<String> hSet = new HashSet<>();
		// Listlerde add() methodu hep yeni elemani sona ekler ama HashSet'lerde böyle
		// bir zorunluluk yoktur. 
		// HashSet'ler elemanlari ekrana rastgele yazdirir, kural yoktur
		
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Ali");
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		// Ayni eleman HashSet'e eklenmek istendiginde Compile Time veya Run Time Error
		// alinmaz. Son eklenen eleman ilk eklenen elemanin üstüne yazilir.
		hSet.add("Apple");
		System.out.println(hSet);
		
		System.out.println(hSet.hashCode());
		
		
		
		
		
	}

}
