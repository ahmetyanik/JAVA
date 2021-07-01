package day35collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		
		// LinkedList bir class'tir
		// LinkedList'te head haric her eleman icin bir data ve bir pointer vardir
		// Head'de sadece pointer vardir
		// Her elemanin pointeri bir sonraki elemani gösterir, son eleman'in (tail) pointer'i
		// null gösterir
		// Data ve pointer iceren her elemanin diger adi "Node" dur.
		// LinkedList eleman ekleme ve cikarma durumlarinda basarilidir.
		
		
		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		System.out.println(linkList);
		
		linkList.remove(2); //remove() methodu indexe göre eleman siler
		System.out.println(linkList);
		
		linkList.removeFirst();//removeFirst() methodu linkList'in ilk elemanini siler
		System.out.println(linkList);
		
		linkList.removeLast(); //removeLast() methodu linkList'in son elemanini siler
		System.out.println(linkList);
		
		linkList.add(1, "Ali"); 
		System.out.println(linkList);
		
		linkList.addFirst("Kemal");
		System.out.println(linkList);
		
		linkList.addLast("Zeynep");
		System.out.println(linkList);
		
		linkList.set(1, "Ajanda");
		System.out.println(linkList);
		
		LinkedList<String> linkList2 = new LinkedList<>();
		
		linkList2.add("X");
		linkList2.add("Y");
		
		linkList.addAll(linkList2);
		
		System.out.println(linkList);
		
		linkList.addAll(3, linkList2);
		System.out.println(linkList);
		
		
		System.out.println(linkList.contains("Can"));
		System.out.println(linkList.contains("Ali"));
		
		linkList2.clear(); //linkedList'in bütün elemanlari silen method clear() methodudur. Elimizde
						   //bos bir linkedList kalir
		System.out.println(linkList2);
		
		
		
		
	}

}
