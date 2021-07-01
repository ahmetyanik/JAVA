package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
		
		
		//Bir list olusturalim ve elemanlarini listiterator yardimi ile degistirelim
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		ListIterator<String> lit = list.listIterator();
		
		while(lit.hasNext()) {
			
			Object element = lit.next();
			lit.set(element+"W");			
			
		}
		
		
		System.out.println(list);
		lit.add("Kemal");
		lit.add("Can");
		
		System.out.println(list);
		
	}

}
