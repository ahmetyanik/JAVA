package alistirmalar;

import java.util.Scanner;

public class RandomSayi {

	public static void main(String[] args) {
		/*0 ile 1000 arasında random bir sayı oluşturarak bu sayının rakamları 
		toplamını veren java algoritma kodunu yazınız ?*/
		
		
	       int randomSayi = (int)(Math.random()*(1000)); //0 ile 1000 arasında sayı
	        System.out.println("random sayi " + randomSayi); //üretilen sayıyı konsola bastırdık
	 
	        int birler = randomSayi %10; //birler basamağı
	 
	        randomSayi = randomSayi /10; 
	        int onlar = randomSayi %10;   //onlar basamağı
	        
	        int yuzler = randomSayi /10;  //yüzler basamağı
	 
	        System.out.println("Toplamları ="+(birler+onlar+yuzler));
	 
	 
	        System.out.println(5/10);
	        
	        
	    }
	}


