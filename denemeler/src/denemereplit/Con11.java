package denemereplit;

import java.util.Scanner;

public class Con11 {

	public static void main(String[] args) {
		
	/*	Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu, 
		değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada 1 
		karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne 
				duyarlıdır.)  

		Sesli harfler: a,e,i,o,u                        */
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("");
	      Scanner in = new Scanner(System.in);
	        
	        String str = in.nextLine();
	        String str2 = str.toLowerCase();
	        char ch = str2.charAt(0);
	        
	        if(str.length() != 1 || !(ch >= 97 && ch <= 122 )) {
	          System.out.println("Yanlis karakter girdiniz!");    
	        }
	        else if(str2.equals("a") || str2.equals("e") || str2.equals("i") || str2.equals("o") || str2.equals("u")) {
	          System.out.println(str + "  harfi sesli harfdir.");
	        } else {
	          System.out.println(str + "  harfi sesiz harftir.");
	        }
	        
	      
	  }
	}