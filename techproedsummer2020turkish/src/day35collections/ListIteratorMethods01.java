package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {

		//Elemanlari A,B ve C olan bir list olusturunuz
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		// listiterator olusturunuz ve list elemanlarini konsola yazdiriniz
		
		ListIterator<String> listIterator = list.listIterator();
		
		//iterator kullanirken her zaman while kullanilir
		
		while(listIterator.hasNext()) {
			
			Object element = listIterator.next();
			System.out.print(element+ " ");			
			
		}
		
		System.out.println();
		
		//hasPrevious() ve previous() methodlarini kullanarak
		//bir listin elemanlarini tersten yazdirmak isterseniz mutlaka
		//önce hasNext() ve next() kullanmalisiniz
		
		while(listIterator.hasPrevious()) {
			
			Object element = listIterator.previous();
			System.out.print(element+" ");
			
		}	
		
	}

}
