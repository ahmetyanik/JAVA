package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// TreeSet: 1) HashSet ile hemen hemen aynidir. Duplication'a musaade etmez
		//			key-value yapisi kullanir. 
		//		    2) TreeSet elemanlarini natural order'a göre(sayi ise kücükten büyüge
		//		    String ise alfabetik siraya göre) dizer HashSet ise elemanlari rastgele
		//			dizer
		//			3) HashSet TreeSet'e göre daha hizlidir.
		//			4) Natural order'a sahip bir Set lazim oldugunda HashSet olusturulur sonra
		//			bu HashSet TreeSet'e dönüstürülür böylelikle TreeSet'in hiz problemi
		//			halledilir. Direkt TreeSet olusturmak genellikle kullanilmaz
		
		TreeSet<String> tSet1 = new TreeSet<>();
		tSet1.add("ABC");
		tSet1.add("String");
		tSet1.add("Test");
		tSet1.add("Pen");
		tSet1.add("Ink");
		tSet1.add("Jack");
		
		System.out.println(tSet1); //Alfabetik sirali verir
		
		// HashSet olusturup Java'nin elemanlari hizli eklemesini saglariz
		// Olusturdugumuz HashSet'i TreeSet constructor'ina parametre olarak
		// koyup TreeSet'e ceviririz, böylelikle TreeSet'in elemanlari natural
		// order yapma özelliginden istifade etmis oluruz
		
		HashSet<String>hSet1 = new HashSet<>();
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		
		
		System.out.println(hSet1); //Alfabetik sirali degil
		
		TreeSet<String> tSet2 = new TreeSet<>(hSet1 ); //Dikkat HashSet'i TreeSet yaptik bu sekilde
		
		System.out.println(tSet2); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
