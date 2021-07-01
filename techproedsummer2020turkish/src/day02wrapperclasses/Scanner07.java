package day02wrapperclasses;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
	
		/*6)Kenar uzunlukları kullanıcıdan alınan bir üçgenin çevresini 
		 * hesaplayan bir  Program yazınız. (byte kullanınız) Not 1: Üçgenin Cevresi: a + b + c
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen birinci kenari giriniz: ");
		byte birinciKenar = scanner.nextByte();
		System.out.print("Lütfen ikinci kenari giriniz: ");
		byte ikinciKenar = scanner.nextByte();
		System.out.print("Lütfen ücüncü kenari giriniz: ");
		byte ücüncüKenar = scanner.nextByte();
		
		System.out.println("Ücgenin Cevresi: "+(birinciKenar+ikinciKenar+ücüncüKenar));
		
	}

}
