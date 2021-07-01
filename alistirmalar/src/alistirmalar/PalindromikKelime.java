package alistirmalar;

import java.util.Scanner;

public class PalindromikKelime {
	
	
	public static void main(String [] args) {
		/*Tersten de aynı okunan kelimelere palindromik kelime denilmektedir. 
		Konsoldan girilen bir kelime veya cümlenin polindromik olup olmadığını 
		veren java algoritma kodunu yazınız ?*/
		
 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Kelime giriniz: ");
        String kelime = scanner.nextLine();
        
        String tersK = "";
        
        int length = kelime.length();
        
        for(int i = 0; i<5; i++) {
        	
        	tersK += kelime.charAt(length-1-i);
        }System.out.println(tersK);
	
	scanner.close();
	
	}	

}
