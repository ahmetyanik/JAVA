package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Alistirma09 {

	public static void main(String[] args) {
		// ["A","C","B","C"] listini olusturun 
		
		List<String> liste = new ArrayList<>();
		System.out.print("Harflerinizi giriniz: ");
		Scanner scanner = new Scanner(System.in);
		
		String harf;
		
		for(int i=0; i<4;i++) {
			
			harf= scanner.nextLine();
			liste.add(harf);
			
		}
		
		System.out.println(liste);
		
		System.out.println(liste.contains("B"));
		
		Collections.sort(liste);
		System.out.println(liste);
		
		
		

	}

}
