package day21multidimensionalarray;

import java.util.Scanner;

public class Alistirma05 {

	public static void main(String[] args) {
	
		//Verilen bir cümlenin kac kelime oldugunu bulunuz
		//Verilen bir cümledeki bosluklar haric karakter sayisini bulunuz
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir cümle giriniz: ");
		String cümle = scanner.nextLine();
		
		String arr[] = cümle.split(" ");
		System.out.println("Cümleniz "+arr.length+" kelimedir");
		
		cümle = cümle.replace(" ", "");
		System.out.println("Cümleniz "+cümle.length()+" harftir.");
		

	}

}
