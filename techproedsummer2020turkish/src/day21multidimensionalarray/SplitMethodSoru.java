package day21multidimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class SplitMethodSoru {

	public static void main(String[] args) {
		
		
		//Verilen bir cümledeki bosluklar haric karakter sayisini bulunuz
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Cümle giriniz: ");
		String cümle = scanner.nextLine();
		
		cümle = cümle.replace(" ", "");
		
		String harf[] = cümle.trim().split("");		
		
		
		System.out.println(Arrays.toString(harf));
		System.out.println(harf.length);
		

	}

}
