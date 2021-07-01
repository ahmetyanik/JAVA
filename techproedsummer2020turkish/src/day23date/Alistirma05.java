package day23date;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alistirma05 {

	public static void main(String[] args) {

//		Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin 
//		toplamını For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		
		
		List<Integer> liste = new ArrayList<>();
		
		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		
		int sum =0; 
		for(int w : liste) {
			
			sum += w*w;					
		}
		
		System.out.println(sum);		
		
	}
	
}
