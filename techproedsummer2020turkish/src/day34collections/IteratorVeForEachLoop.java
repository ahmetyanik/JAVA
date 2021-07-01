package day34collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorVeForEachLoop {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);
		
		Iterator<String> iterator = list1.iterator();
		//hasNext() methodu bir sonraki eleman var mi yok mu diye kontrol eder
		// ==> X,Y,Z
		
		// Asagidaki kod iterator kullanarak list'deki tüm elemanlari ekrana yazdirmaya yarar
		
		/*while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}*/
		
		// for each döngüsü ile bu sekilde yapilir
		
		for( String w: list1 ) {
			
			w = w+"A";
		}
		
		System.out.println(list1);
		
		// for each loop ile degisim yapmaya calisalim
		
		
		//Iterator ile for-each loop farki
		//for each loop elemanlar arasinda gezer ama collection'i degistiremez ama iterator ise elemanlar 
		//arasinda gezer ve collection'i degistirebilir
		
		
		//iterator ile degisim yapmaya calisalim: degisim olur
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove(); //remove eleman siler
		}
		
		System.out.println(list1);
		
		
	}

}
