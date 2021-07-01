package day06ifstatetement;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		/* Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise 
		 * ekrana “Sesli harf” yazdırın. “b, c, d, e” den biri ise ekrana “Sessiz harf” yazdırın.
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen bir harf giriniz: ");
		String harf = scanner.next();
		
		if(harf.equals("a")|| harf.equals("e")||harf.equals("i")||harf.equals("o")||harf.equals("u")) {
			
			System.out.println(harf+" Sesli Harftir");
			
		}else if(harf.equals("b")|| harf.equals("c")||harf.equals("d")||harf.equals("e")) {
			
			System.out.println(harf+" Sessiz Harftir");
		
		}else {
			
			System.out.println("Lütfen gecerli bir harf giriniz.");
			
		}

}}
