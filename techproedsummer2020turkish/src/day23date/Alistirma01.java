package day23date;

import java.util.ArrayList;
import java.util.List;

public class Alistirma01 {

	public static void main(String[] args) {
		// integer bir arrayimiz var, bu array içindeki tek sayıları bulup 
		//bu rakamlardan oluşan yeni bir array(list) oluşturuyoruz

		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> list = new ArrayList<>();
		
		for(int w : arr) {
			
			if (w%2==1) {
				
				list.add(w);
			}
			
		}
		
		System.out.println(list);
		
		
	}

}
