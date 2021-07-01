package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class Alistirma08 {

	public static void main(String[] args) {
		
		// ["Ali","Can","Ayse","Ali"] listini olusturunuz
		
		List<String> liste = new ArrayList<>();
		
		liste.add("Ali");
		liste.add("Can");
		liste.add("Ayse");
		liste.add("Ali");
		
		System.out.println(liste);
		
		liste.remove("Ali");
		System.out.println(liste);
		liste.remove("Ayhan");
		
		liste.set(0, "Ali Can");
		System.out.println(liste);
		liste.clear();
		System.out.println(liste);
		
		
		

	}

}
