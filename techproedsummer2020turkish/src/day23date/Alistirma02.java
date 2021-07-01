package day23date;

import java.util.Arrays;

public class Alistirma02 {

	public static void main(String[] args) {
		// interger arrayımız var ilk veya son indexi 13 ise false, değilse true
		
		int arr[] = {1,2,3,4,5,6,13};
		int count = 0;
		
			for(int w : arr) {
			
				if(w==13 || arr[arr.length-1]==13) {
				
					count ++;
			}
			}
		
		if(count>0) {
		
		System.out.println("true");
		
	}else {
		System.out.println("false");
		
		
	}
		

	}

}
