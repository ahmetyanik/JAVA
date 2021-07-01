package day07nestedif;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir harf girmesini isteyin.  Girdiği küçük harf ise harﬁn “a” olup olmadığını kontrol edin.
		 *  Harf “a” ise ekrana “Ilk küçük harf” yazdırın. “a” değil ise ekrana “Ilk küçük harf değil” yazdırın. 
		 *  Girdiği büyük harf ise harﬁn “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
		 *   “Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir harf giriniz: ");
		char harf = scanner.next().charAt(0);
		
		if(harf>=97 && harf<=122) {
			
			if(harf==97) {
				System.out.println("Ilk kücük harf");
			}else {
				System.out.println("Ilk kücük harf degil"); 
			}}
		if(harf>=65 && harf<=90) {
			
			if(harf==90) {
				System.out.println("Son büyük harf");
			}else {
				System.out.println("Son büyük harf degil!");
			}
		}
		
		scanner.close();
	}		
	
	

}
