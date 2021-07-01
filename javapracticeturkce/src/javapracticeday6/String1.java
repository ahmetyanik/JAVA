package javapracticeday6;

import java.util.Arrays;
import java.util.Scanner;

public class String1 {

	public static void main(java.lang.String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Cümle giriniz: ");
		String str = scanner.nextLine();
		
		
		String[] x =str.split(" ");
		
		System.out.println(Arrays.toString(x));
		
		String yeni = "" ;
	
		for(int i= x.length-1; i>=0;i--) {
			
			yeni +=  x[i]+" ";
			
			
		}
		System.out.println(yeni);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
