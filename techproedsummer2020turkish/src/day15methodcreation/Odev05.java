package day15methodcreation;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
//		Kullanıcıya bir String girmesini söyleyin ve bu String’i yukarıdan aşağıya doğru 
//		yazdıran  Program yazınız. Ornegin; CAN ==> C                                                               
//													A                                                               
//													N
		
		yukardan();
		
		

	}
	
	public static void yukardan() {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir yazi giriniz: ");
		String yazi = scanner.nextLine();
		
		int uzunluk = yazi.length()-1;
		for(int i =0; i<=uzunluk;i++) {
			
			System.out.println(yazi.charAt(i));
			
		}
		
		
	}
	



}
