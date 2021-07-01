package denemeler;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sil04 {

	public static void main(String[] args) {
		   
		Scanner in = new Scanner(System.in);
        System.out.print("");
        int input = in.nextInt();
        
        if(input>0){
          System.out.println("Sayı Pozitif");
        }else if(input<0){
          System.out.println("Sayı Negatif");
        }else{
          System.out.println("Sayı Sıfır");
        }}}  