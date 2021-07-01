package deneme002;

import java.util.Random;
import java.util.Scanner;public class Soru1 

{public static void main(String[] args) {

    Random rastgele = new Random();  // her denemede yeni sayı atıyor.
    int tutulansayı=0;
    
    int girilen=0;
    int sayac = 0;
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Sayı Girin");
    
    do {
    
        
        tutulansayı=(int)(Math.random()*10);
        girilen = scan.nextInt();
        sayac++;
        if(sayac>5) 
       	 System.out.println("hakkınız bitti");
        
        else if (girilen > tutulansayı)
        
            System.out.println("Küçük bir sayı girin");
        
        else if (girilen<tutulansayı)
        
            System.out.println("Büyük bir sayı girin");
        
    }    	while (girilen!=tutulansayı);
    System.out.println("Tebrikler"+sayac+" .denemenizde buldunuz"); 
   
    System.out.println();
}  



}  
