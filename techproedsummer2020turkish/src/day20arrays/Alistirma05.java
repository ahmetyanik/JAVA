package day20arrays;

import java.util.Arrays;

public class Alistirma05 {

	public static void main(String[] args) {
		
/*		3. Write a Java program to print the following grid. Go to the editor

		Expected Output :

		- - - - - - - - - -                                                                                           
		- - - - - - - - - -                                                                                           
		- - - - - - - - - -                                                                                           
		- - - - - - - - - -                                                                                           
		- - - - - - - - - -                                                                                           
		- - - - - - - - - -                                                                                           
		- - - - - - - - - -                                                                                           
		- - - - - - - - - -                                                                                           
		- - - - - - - - - -                                                                                           
		- - - - - - - - - -                               */
		
		
		char arr[] = {'-','-','-','-','-','-','-','-','-','-'};
		int j =0;
		for(int i=0;i<10;i++) {
			
			for(j=0;j<9;j++)
			
			System.out.print(arr[i]+" ");
			System.out.println(arr[j]+" ");
		}
		

	}

}
