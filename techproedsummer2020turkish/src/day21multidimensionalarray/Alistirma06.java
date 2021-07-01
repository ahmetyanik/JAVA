package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class Alistirma06 {

	public static void main(String[] args) {
		
		List<String> liste = new ArrayList<>();
		
		liste.add("Ahmet");
		liste.add("Yanik");
		liste.add("Zeynep");
		liste.add("Duru");
		
		System.out.println(liste);
		
		liste.add(0, "Veli");
		liste.add(liste.size(), "Ayse");
		
		System.out.println(liste);
		System.out.println(liste.size());
		
		
		
		
		

	}

}
