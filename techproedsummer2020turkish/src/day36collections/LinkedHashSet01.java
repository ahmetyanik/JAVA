package day36collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		// LinkedHashSet: 1) Duplication'a izin vermez
		//				  2) Elemanlari programcinin girdigi siraya göre dizer
		
		LinkedHashSet<String> lhSet = new LinkedHashSet();
		lhSet.add("Z");
		lhSet.add("A");
		lhSet.add("D");
		lhSet.add("B");

		System.out.println(lhSet); // [Z, A, D, B] ekleme sirasina göre yazar
		
		
		LinkedHashSet<Integer> lhSet1 = new LinkedHashSet();
		lhSet1.add(3);
		lhSet1.add(1);
		lhSet1.add(5);
		lhSet1.add(0);

		System.out.println(lhSet1); // [3, 1, 5, 0] ekleme sirasina göre yazar
		
		
		//LinkedHashSet' TreeSet'e cevirelim
		TreeSet<Integer> tSet = new TreeSet<>(lhSet1);
		
		System.out.println(tSet); // [0, 1, 3, 5]
		
	}

}
