package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class Alistirma07 {

	public static void main(String[] args) {
		
		List<Integer> liste = new ArrayList<>();
		
		System.out.println(liste.isEmpty());
		
		liste.add(2);
		System.out.println(liste);
		
		System.out.println(liste.isEmpty());
		
		System.out.println(liste.remove(0));
		System.out.println(liste);
		
		liste.add(123);
		System.out.println(liste);
		
		liste.remove(0);
		System.out.println(liste);
		
		liste.add(34);
		liste.add(45);
		liste.remove(liste.size()-1);
		System.out.println(liste);

	}

}
